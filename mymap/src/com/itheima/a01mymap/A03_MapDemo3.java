package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Zxy
 */
public class A03_MapDemo3 {
    public static void main(String[] args) {
        //2.按键值对遍历map

        Map<String,String> map =new HashMap<> ();
        map.put ("biaoqiangxuanshou","machao");
        map.put ("renwuguajia","mingshiyin");
        map.put ("yulongqishi","yinzhiping");

        //entryset获得键值对对象存入set
        Set<Map.Entry<String, String>> entries = map.entrySet ();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println (entry.getKey ()+" = "+entry.getValue ());
        }
    }
}
