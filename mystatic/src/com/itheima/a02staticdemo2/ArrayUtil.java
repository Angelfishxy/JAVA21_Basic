package com.itheima.a02staticdemo2;

public class ArrayUtil {
    //static静态方法
    //私有化构造方法
    private ArrayUtil(){}

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder ();
        sb.append ("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append (arr[i]);
            }else{
                sb.append (arr[i]+", ");
            }
        }
        sb.append ("]");
        return sb.toString ();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
