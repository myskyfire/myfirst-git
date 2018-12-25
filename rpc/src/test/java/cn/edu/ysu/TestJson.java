package cn.edu.ysu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * <p><b>Description：</b></p>
 * <p>ss</p>
 * <p><b>createTime: </b></p>
 * <p>2018/6/25 17:41</p>
 *
 * @author huangjinzhao
 * @since ss
 */

public class TestJson {

    protected void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufr1 = new BufferedReader(new FileReader("E:/a.txt"));
        BufferedReader bufr2 = new BufferedReader(new FileReader("E:/b.txt"));

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String line =null;
        while((line=bufr1.readLine())!=null){
            sb1.append(line);
        }
        while((line=bufr2.readLine())!=null){
            sb2.append(line);
        }
        Gson gson1 = new GsonBuilder().create();//or new Gson()
        JsonElement e1 = gson1.toJsonTree(sb1.toString());//or new Gson()

        Gson gson2 = new GsonBuilder().create();
        JsonElement e2 = gson2.toJsonTree(sb2.toString());
        System.out.println(e1.equals(e2));
    }
}
