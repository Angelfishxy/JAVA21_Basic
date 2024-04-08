package com.itheima.search;

import java.util.ArrayList;

public class A01_BasicSerachDemo3 {
    //按值查找，返回相同的所有索引值
    public static void main(String[] args) {
        int[] arr ={10,21,82,929,1230,82};
        int num = 82;
        System.out.println (basicSearch (arr,num));
    }
    public static ArrayList<Integer> basicSearch(int[] arr , int e){
        ArrayList<Integer> list = new ArrayList<> ();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e){
                list.add (i);
            }
        }
        return list;
    }
}

