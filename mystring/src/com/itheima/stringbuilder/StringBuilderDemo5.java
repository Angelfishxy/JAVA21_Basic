package com.itheima.stringbuilder;

public class StringBuilderDemo5 {
    //字符串拼接
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println (arrayToString (arr));
    }
    public static String arrayToString(int[]arr){
        StringBuilder sb = new StringBuilder ("[");
        for (int i = 0; i < arr.length-1; i++) {
            sb.append (arr[i]).append(", ");
        }
        sb.append(arr[arr.length-1]).append ("]");
        return sb.toString ();
    }
}
