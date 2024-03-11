package com.itheima.stringbuilder;

/**
 * @author Zxy
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //stringbuilder 创建
        StringBuilder sb = new StringBuilder ("abc");
        //添加
        sb.append (1);
        sb.append (2.3);
        sb.append(true);
        //反转
        sb.reverse ();
        System.out.println (sb);
        //获取长度
        int len = sb.length ();
        System.out.println (len);
        //打印对象不是地址值，而是属性值
        //System.out.println (sb);
    }
}
