package com.itheima.search;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {

    }
    public static int basicSearch(int[] arr,int e){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e){
                return i;
            }
        }
        return -1;
    }
}

