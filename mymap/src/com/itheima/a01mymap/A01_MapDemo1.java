package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    /*map
    V put(K key, K value)
    V remove(Object　key)
    boolean containsKey(Object Key)
    boolean containsValue(Object Value)
     */
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<> ();
        //put -  > 添加/覆盖，若键不存在，直接将键值对添加到map中，返回null
        //若键存在，将原有键值对覆盖，并返回被覆盖的值
        m.put ("guojing", "huangrong");
        m.put ("weixiaobao", "mujianping");
        m.put ("yangguo", "xiaolongnv");

        String value = m.put ("weixiaobao", "shuanger");
        System.out.println (value);
        System.out.println (m);
        System.out.println ("===================");

        //remove按键删除，返回被删除的值
        String result = m.remove ("guojing");
        System.out.println (result);
        System.out.println (m);
        System.out.println ("============");

        //按键查找
        boolean keyResult = m.containsKey ("weixiaobao");
        System.out.println (keyResult);

        //按值查找
        boolean valueResult  = m.containsValue ("xiaolongnv2");
        System.out.println (valueResult);
    }
}
