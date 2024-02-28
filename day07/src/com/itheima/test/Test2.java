package com.itheima.test;

public class Test2 {
    /*判断101-200之间多少个质数，并输出所有质数

     */
    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;
        for (int i =101; i<=200; i++){
            count = isPrimeNum (i, arr, count);
        }
        System.out.println ("质数的个数为："+count);
        System.out.println ("所有的质数为");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                System.out.print (arr[i] + ", ");
            }
        }
    }
    //判断质数
    public static int isPrimeNum(int n, int[] arr, int count){
        boolean flag = true;
        for (int i = 2; i<n; i++){
            if(n % i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            arr[count] = n;
            count++;
        }
        return count;
    }
}
