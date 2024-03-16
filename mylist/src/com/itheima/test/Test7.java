package com.itheima.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<> ();

        User u1 = new User ("heima001", "zhangsan", "123456");
        User u2 = new User ("heima002","zhangsan","12345678");
        User u3 = new User ("heima003","lisi","123qwer");

        list.add (u1);
        list.add (u2);
        list.add (u3);

        System.out.println (getIndex (list, "heima004"));
    }
    public  static int getIndex(ArrayList<User> list ,String id){
        for (int i = 0; i < list.size (); i++) {
            if(list.get (i).getId ().equals (id)){
                return i;
            }
        }
        return -1;
    }

}
