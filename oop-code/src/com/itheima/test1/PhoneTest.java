package com.itheima.test1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个对象
        Phone p = new Phone ();

        p.brand = "xiaomi";
        p.price = 6888.88;

        System.out.println (p.brand);
        System.out.println (p.price);

        p.call ();
        p.playGame ();

        Phone p2 = new Phone ();
        p2.brand = "apple";
        p2.price = 9899;
        System.out.println (p2.brand);
        System.out.println (p2.price);
    }
}
