package cn.ysu.edu.util;

import cn.ysu.edu.domain.Food;

public class StaticUtils {

    /*@Autowired  ----Autowired annotation is not supported on static fields
    private static Food food;*/


    private static Food food;

    /*@Autowired  Autowired annotation is not supported on static methods
    public static void setFood(Food food) {
        StaticUtils.food = food;
    }*/

    /*@Autowired               ----OK
    public  void setFood(Food food) {
        StaticUtils.food = food;
    }*/

    public static void setFood(Food food){
        StaticUtils.food=food;
    }

    public static String getFullName(String a){
        return food.getName()+a;
    }
}
