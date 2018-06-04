package cn.ysu.edu.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by huangjinzhao on 2017/5/10.
 */
public class Animal implements Serializable{
    private int age;
    private String name;
    private List<Food> foodLike;
    private Food favouriteFood;
    private Map<String,String> otherProperties;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoodLike() {
        return foodLike;
    }

    public void setFoodLike(List<Food> foodLike) {
        this.foodLike = foodLike;
    }

    public Food getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(Food favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public Map<String, String> getOtherProperties() {
        return otherProperties;
    }

    public void setOtherProperties(Map<String, String> otherProperties) {
        this.otherProperties = otherProperties;
    }

    public String toString()
    {
        StringBuffer sbf = new StringBuffer();
        sbf.append("age="+age).append(",name="+name).append(",");
        return sbf.toString();
    }
}
