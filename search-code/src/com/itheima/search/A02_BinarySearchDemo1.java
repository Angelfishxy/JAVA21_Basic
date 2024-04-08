package com.itheima.search;

public class A02_BinarySearchDemo1 {
    //有序数组二分查找
    //改进：插值查找，斐波那契查找
    public static void main(String[] args) {
        int [] arr ={7,24,26,84,89,147};
        System.out.println (binarySearch (arr,147));
    }
    public static int binarySearch(int[] arr ,int e){
        int min =0;
        int max = arr.length-1;
        while (true){
            if(min>max){
                return -1;
            }
            int mid = (min + max)/2;
            if(arr[mid] > e){
                max = mid-1;
            }else if(arr[mid] < e){
                min = mid+1;
            }else if(arr[mid] == e){
                return mid;
            }
        }
    }
}
