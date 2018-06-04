package cn.ysu.edu;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLDecoder;

/**
 * <p><b>Description：</b></p>
 * <p>test</p>
 * <p><b>createTime: </b></p>
 * <p>2018/2/27 15:27</p>
 *
 * @author HuangJinzhao
 * @since V1.0
 */

public class TestHttpClient {

    public static void main(String[] args){
        String url="http://120.52.49.67:8000/api/user/granted/info/sync/v1";
        //post请求返回结果
        DefaultHttpClient httpClient = new DefaultHttpClient();
        JSONObject jsonResult = null;
        HttpPost method = new HttpPost(url);
        try {
            method.addHeader("Accept", "application/json");
            method.addHeader("Content-Type","application/json; charset=UTF-8");
            method.addHeader("Accept-Encoding","gzip");//需要压缩时gzip，不需要时为空即可
            method.addHeader("Accept-Charset", "utf-8");
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**请求发送成功，并得到响应**/
            if (result.getStatusLine().getStatusCode() == 200) {
                String str = "";
                try {
                    /**读取服务器返回过来的json字符串数据**/
                    str = EntityUtils.toString(result.getEntity());
                    /**把json字符串转换成json对象**/
                    jsonResult = JSONObject.parseObject(str);
                    System.out.println(str);
                } catch (Exception e) {
//                    LOGGER.error("post请求提交失败:" + url, e);
                }
            }
        } catch (IOException e) {
//            LOGGER.error("post请求提交失败:" + url, e);
        }
    }
}
