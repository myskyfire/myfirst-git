package cn.ysu.edu.domain;

import java.io.Serializable;

/**
 * Created by huangjinzhao on 2017/5/10.
 */
public class Food implements Serializable{

   public  Food(String name,String alias)
    {
        this.name=name;
        this.alias=alias;
    }

    public Food(String name)
    {
        this.name=name;
        this.alias="";
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    private String alias;
}
