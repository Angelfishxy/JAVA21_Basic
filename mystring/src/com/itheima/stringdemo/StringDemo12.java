package com.itheima.stringdemo;

public class StringDemo12 {
    //敏感词替换
    public static void main(String[] args) {
        String talk = "你玩的真好,mlgb,以后都不要玩了。tmd,cnm";
        //String result = talk.replace ("tmd","***");
        //System.out.println (result);
        String[] arr ={"tmd","cnm","sb","mlgb"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace (arr[i],"***");
        }
        System.out.println (talk);
    }
}
