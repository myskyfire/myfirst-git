package cn.ysu.edu;

import cn.edu.ysu.domain.Animal;
import cn.edu.ysu.domain.Food;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangjinzhao on 2017/5/10.
 */
public class FastJsonTest {
    @Test
    public void testFastJsonToString()
    {
        Animal an = new Animal();
        an.setAge(2);
        an.setName("hal");
        Food f1 = new Food("bread");
        Food f2 = new Food("meat");
        List<Food> foodList = new ArrayList<Food>();
        foodList.add(f1);
        foodList.add(f2);
        an.setFavouriteFood(f2);
        an.setFoodLike(foodList);
        System.out.println(JSON.toJSONString(an));
    }


}

