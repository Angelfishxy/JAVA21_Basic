package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //1.数组的索引
        int[] arr = {1, 2, 3, 4, 5};
        int number = arr[0];
        System.out.println (number);

        //2.数据存储到数组中
        arr[0] = 100;
        System.out.println (arr[0]);
    }
}
