package cn.edu.ysu.designPattern;

/**
 * <p><b>Description：</b></p>
 * <p>Sigleton design pattern</p>
 * <p><b>createTime: </b></p>
 * <p>2018/7/4 16:16</p>
 *
 * @author huangjinzhao
 * @since V1.0
 */

public class Singleton {


}

class HungryPattern{

    private static HungryPattern hp = new HungryPattern();

    private HungryPattern(){}

    public static HungryPattern newInstance(){
        return  hp;
    }
}

class LazyPattern{
    private static LazyPattern lp;
    private LazyPattern(){}
    public  static  LazyPattern newInstance(){
        if(lp==null){
            synchronized (LazyPattern.class){
                if (lp==null){
                    lp = new LazyPattern();
                }
            }
        }
        return lp;
    }
}

class InnerClassPattern{
    private InnerClassPattern(){}

    static class InnerClass{
            public static final InnerClassPattern icp = new InnerClassPattern();
    }

    public static InnerClassPattern newInstance(){
        return InnerClass.icp;
    }
}


