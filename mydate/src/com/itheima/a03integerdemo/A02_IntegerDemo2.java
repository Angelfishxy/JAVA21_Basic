package com.itheima.a03integerdemo;

public class A02_IntegerDemo2 {
    //包装类进行计算
    //自动装箱：基本数据类型自动变成对应包装类
    //自动拆箱:包装类自动变成对应基本数据类型

    //进制转换
    public static void main(String[] args) {
        String str1= Integer.toBinaryString (100);
        System.out.println (str1);

        String str2 = Integer.toOctalString (100);
        System.out.println (str2);

        String str3 = Integer.toHexString (100);
        System.out.println (str3);

        //java强类型语言，每种数据都有其对应的数据类型
        //parseint只能用数字
        //
        int i = Integer.parseInt ("123");
        System.out.println (i + 1);
    }

}
