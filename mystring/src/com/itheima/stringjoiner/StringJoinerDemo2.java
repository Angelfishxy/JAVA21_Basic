package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner (", ","[","]");
        String str = sj.add("aaa").add("bbb").add ("ccc").toString ();
        System.out.println (str);
        System.out.println (sj.length ());

    }
}
