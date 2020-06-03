package cn.ysu.edu;

public class TestLong {

    static void changeLongValue(Long l){
        l++;
    }

    public static void main(String[] args) {
        Long a = new Long(2);
        changeLongValue(a);
        System.out.println(a);
    }
}
