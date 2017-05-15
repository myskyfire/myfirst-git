package cn.ysu.edu;

import cn.ysu.edu.domain.Animal;

import java.io.*;

/**
 * Created by huangjinzhao on 2017/5/10.
 */
public class SerializObject {
    public void seriablizeObjectToFile(String filePath,Object obj)
    {
        try {
            File file = new File(filePath);
            if(!file.exists())
            {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object deserializeObject(String filePath)
    {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            Object obj = ois.readObject();
            if(obj instanceof Animal)
            {
                Animal am = (Animal)obj;
                return am;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
