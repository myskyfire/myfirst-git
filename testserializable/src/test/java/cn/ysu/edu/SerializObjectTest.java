package cn.ysu.edu;

import cn.ysu.edu.domain.Animal;
import cn.ysu.edu.domain.Food;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangjinzhao on 2017/5/10.
 */

public class SerializObjectTest {

    private String filePath="D:/animal.txt";
    @Before
    public void serializObject()
    {
        SerializObject so = new SerializObject();
        Animal an = new Animal();
        an.setAge(2);
        an.setName("hal");
        Food f1 = new Food("bread");
        Food f2 = new Food("meat");
        List<Food> foodList = new ArrayList<Food>();
        foodList.add(f1);
        foodList.add(f2);
        /*an.setFavouriteFood(f2);
        an.setFoodLike(foodList);*/
        so.seriablizeObjectToFile(filePath,an);
    }

    @Test
    public void testSerializObject()
    {
        SerializObject so = new SerializObject();
        Object obj = so.deserializeObject(filePath);
        if(obj instanceof Animal)
        {
            Animal an = (Animal)obj;
            System.out.print(an);
        }
    }
}
