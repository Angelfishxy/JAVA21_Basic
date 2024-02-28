package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    /*6个评委评分，范围为0-100的整数，分别去掉一个最高分和最低分后取平均值*/
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] scores = new int[6];
        int grade = 0;
        for(int i = 0; i<scores.length;){
            System.out.println ("请输入分数：");
            int score = sc.nextInt ();
            if(score>0 || score<100){
                grade += score;
                scores[i] = score;
                i++;
            }else{
                System.out.println ("请输入合法分数：");
            }
        }
        int max = getMax (scores);
        int min =  getMin (scores);
        grade = (grade-min-max)/4;
        System.out.println ("最终成绩为："+grade);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max>arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min<arr[i])
                min = arr[i];
        }
        return min;
    }
}
