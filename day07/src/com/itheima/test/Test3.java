package com.itheima.test;

import java.util.Random;

public class Test3 {
    /*开发验证码，长度为5，前四位为大小写字母，最后一位为数字*/
    public static void main(String[] args) {
        String code = "";
       char[] word = new char[52];
        for (int i = 0; i < word.length; i++) {
            if (i <= 25) {
                word[i] = (char) (97 + i);
            }else{
                word[i] = (char)(65+i-26);
            }
        }
        Random rd = new Random ();
        for(int i = 0;i < 4; i++) {
            int tmp = rd.nextInt (word.length);
            code = code + word[tmp];
        }
        code = code + rd.nextInt (10);
        System.out.println (code);
    }

}
