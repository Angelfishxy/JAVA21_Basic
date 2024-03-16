package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.直接法
        String s1 ="abc";
        System.out.println (s1);

        //2.new
        String s2 = new String ();
        System.out.println ("@"+ s2 +"!");

        //3.含参构造
        String s3= new String ("abc");
        System.out.println (s3);

        //4.依据字符数组
        //字符串本身不可以更改
        char[] chs ={'a', 'b','c','d'};
        String s4 = new String (chs);
        System.out.println (s4);

        //5.字节数组构造
        //依据ascii码表进行转换
        byte[] bytes ={97,98,99,100};
        String s5= new String (bytes);
        System.out.println (s5);
    }
}
