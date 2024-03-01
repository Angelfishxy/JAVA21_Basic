package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf2 = new GirlFriend ();
        gf2.setName("xiaoxuan");
        gf2.setAge(18);
        gf2.setGender("mengmeizi");

        System.out.println (gf2.getName());
        System.out.println (gf2.getAge());
        System.out.println (gf2.getGender ());

        gf2.sleep();
        gf2.eat();
    }


}
