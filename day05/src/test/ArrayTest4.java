package test;

import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        /*生成10个1-100之间的随机数存入数组，
        1.求出所有数据的和
        2.求出所有数据的平均值
        3.统计出有多少个数据比平均值小
         */

        int[] arr = new int[10];
        Random r = new Random ();
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        double avg = (double) sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println ('\n' + "sum = " + sum);
        System.out.println ("average = " + avg);
        System.out.println ("count = " + count);
    }
}
