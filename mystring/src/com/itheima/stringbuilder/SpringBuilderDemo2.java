package com.itheima.stringbuilder;

/**
 * @author Zxy
 */
public class SpringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ();
        String str = sb.append ("aaa").append ("bbb").append ("ccc").append ("ddd").toString ();

        System.out.println (str);
    }
}
