package cn.edu.ysu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyServiceProxyHandler implements InvocationHandler {

  /*  private MyService myService;

   public MyServiceProxyHandler(MyService myService){
        this.myService=myService;
    }*/

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("before");
//        method.invoke(myService,objects);
        System.out.println("after");
        return null;
    }
}
