package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        //折纸问题

        double height = 8844430;
        double paper = 0.1;
        int cout =  0;
        while(paper <= height){
            paper *= 2 ;
            cout++;
        }
        System.out.println ("折纸的次数为："+cout);
    }
}
