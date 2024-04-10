package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A04_MapDemo4 {
    //3.lambda表达式遍历
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<> ();
        map.put ("yangguo","xiaolongnv");
        map.put ("guojing","huangrong");
        map.put ("ouyangke","munianci");



        //forEach匿名内部类
        map.forEach ((key, value) ->  System.out.println (key+" = "+value));
    }
}
