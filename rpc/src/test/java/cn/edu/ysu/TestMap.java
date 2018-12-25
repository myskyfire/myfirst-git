package cn.edu.ysu;

import cn.edu.ysu.sub.C;
import cn.edu.ysu.sub.F;

/**
 * <p><b>Description：</b></p>
 * <p>test map</p>
 * <p><b>createTime: </b></p>
 * <p>2018/6/27 16:14</p>
 *
 * @author huangjinzhao
 * @since test map
 */

public class TestMap {
    public static void main(String[] args) {
        B b = new B();
        b.sayHello();

       /* D d = new D();
        d.sayHello();*/

        F f = new F();
        f.sayE();
    }
}

class A{
    protected  void sayHello(){
        System.out.println("hello");
    }
}

class B extends A{

}

class D extends C {

}
