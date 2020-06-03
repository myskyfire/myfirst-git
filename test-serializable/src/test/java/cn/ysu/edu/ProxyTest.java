package cn.ysu.edu;

import cn.edu.ysu.proxy.MyServiceProxyHandler;
import cn.edu.ysu.service.MyService;
import cn.edu.ysu.service.impl.MyServiceImpl;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        MyService ms = (MyService) Proxy.newProxyInstance(MyService.class.getClassLoader(),MyServiceImpl.class.getInterfaces(),new MyServiceProxyHandler());
        ms.print("jack");
    }
}
