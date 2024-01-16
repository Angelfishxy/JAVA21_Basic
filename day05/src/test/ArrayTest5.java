package test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        //交换数组顺序
        Random r = new Random ();
        int len = r.nextInt(20) + 1;
        System.out.println (len);
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i] ;
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println ();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
