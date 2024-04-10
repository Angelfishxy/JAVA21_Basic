package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //map遍历

        //1.按键找值

        Map<String,String> map =new HashMap<> ();
        map.put ("yangguo","xiaolongnv");
        map.put ("guojing","huangrong");
        map.put ("ouyangke","munianci");

        //map键放到set中
        Set<String> keys = map.keySet ();
        //增强for（也可以迭代器、lambda表达式）
        for (String key : keys) {
            //System.out.println (key);
            //按键查找get
            String value = map.get (key);
            System.out.println (value);
        }


    }
}
