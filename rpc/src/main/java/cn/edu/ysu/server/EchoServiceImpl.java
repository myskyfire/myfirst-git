package cn.edu.ysu.server;

import cn.edu.ysu.intf.EchoService;

/**
 * <p><b>Description：</b></p>
 * <p>echo service</p>
 * <p><b>createTime: </b></p>
 * <p>2018/6/12 8:51</p>
 *
 * @author huangjinzhao
 * @since V1.0
 */

public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String s) {
        return s==null?"hello world":"hello "+s;
    }
}
