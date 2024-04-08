package com.itheima.search;

public class A01_BasicSearchDemo1 {
    //基本查找 顺序查找
    public static void main(String[] args) {
        int[] arr ={10,21,82,929,1230};
        int num = 82;
        System.out.println (basicSearch (arr,num));
    }
    public static boolean basicSearch(int[] arr ,int e){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e){
                return true;
            }
        }
        return false;
    }
}
