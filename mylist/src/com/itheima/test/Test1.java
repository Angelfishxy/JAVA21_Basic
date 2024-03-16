package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    //定义一个集合，添加字符串，并进行遍历
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<> ();
        list.add("jiayou");
        list.add ("work");
        list.add ("come on");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size ()-1){
                System.out.print (list.get (i)+"]");
            }else{
                System.out.print(list.get (i)+", ");
            }
        }
    }


}
