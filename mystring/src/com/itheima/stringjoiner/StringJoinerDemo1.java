package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    //StringJoiner(间隔符号)
    //StringJoiner(间隔，开始，结束)

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner ("---");
        sj.add("aaa").add("bbb").add("ccc").toString ();
        System.out.println (sj);

    }
}
