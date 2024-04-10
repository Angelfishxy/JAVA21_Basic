package com.itheima.a01mymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class A06_HashMapDemo2 {
         //统计投票人数
    public static void main(String[] args) {
        String[] spot = {"A","B","C","D"};
        Random rd = new Random ();
        ArrayList<String> vote = new ArrayList<> ();
        for (int i = 0; i < 80; i++) {
            vote.add (spot[rd.nextInt (4)]);
        }

        String result = "";
        int max = 20;
        HashMap<String ,Integer> hm = new HashMap<> ();
        for (String v : vote) {
            if(hm.containsKey (v)){
                hm.put (v,hm.get (v)+1);
                result = max < hm.get (v) ? v : result;
                max= Math.max (hm.get (v),max);
            }else{
                hm.put (v,1);
            }
        }
        System.out.println (hm);
        System.out.println (result+" : "+max);
    }
}
