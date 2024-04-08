package com.itheima.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3 ,4 ,5};
        String str = ArrayUtil.printArr (arr1);
        System.out.println (str);

        double[] arr2 = {1.5,2.6,6.4,5.23,5.6};
        double avg = ArrayUtil.getAverage (arr2);
        System.out.println (avg);
    }
}
