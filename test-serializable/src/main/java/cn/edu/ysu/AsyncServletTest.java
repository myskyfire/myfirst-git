package cn.edu.ysu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p><b>Description：</b></p>
 * <p>Test Async Servlet</p>
 * <p><b>createTime: </b></p>
 * <p>2019/1/24 11:23</p>
 *
 * @author huangjinzhao
 * @since v1.0
 *
 * 测试请求异步处理
 */

public class AsyncServletTest {
    private Logger logger = LoggerFactory.getLogger(AsyncServletTest.class);

    @RequestMapping("/testAsync")
    @ResponseBody
    public void testAsync(HttpServletRequest request){
        request.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
        AsyncContext asyncContext = request.startAsync();
        asyncContext.setTimeout(17000);
        asyncContext.addListener(new AsyncListener() {
            @Override
            public void onComplete(AsyncEvent asyncEvent) throws IOException {
                logger.info("onComplete");
            }

            @Override
            public void onTimeout(AsyncEvent asyncEvent) throws IOException {
                logger.info("onTimeout");
            }

            @Override
            public void onError(AsyncEvent asyncEvent) throws IOException {
                logger.info("onError");
            }

            @Override
            public void onStartAsync(AsyncEvent asyncEvent) throws IOException {
                logger.info("onStartAsync");
            }
        });

        try {
            HttpServletResponse response = (HttpServletResponse) asyncContext.getResponse();
            final PrintWriter writer = response.getWriter();

            response.setContentType("text/html;charset=utf-8");
            response.setHeader("Connection", "Keep-Alive");
            new Thread(()->{
                for(int i=0;i<10;i++){
                    writer.println(i+"============================\r\n");
                    writer.flush();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                asyncContext.complete();
            }).start();
            writer.println("start------");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            logger.info("comoooooo---------------");

        }

    }
}
