package cn.ysu.edu;

import cn.ysu.edu.proxy.MyServiceProxyHandler;
import cn.ysu.edu.service.MyService;
import cn.ysu.edu.service.impl.MyServiceImpl;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        MyService ms = (MyService) Proxy.newProxyInstance(MyService.class.getClassLoader(),MyServiceImpl.class.getInterfaces(),new MyServiceProxyHandler());
        ms.print("jack");
    }
}
