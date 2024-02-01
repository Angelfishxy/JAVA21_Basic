package src.com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //定义方法判断数组某一个数是否存在
        int[] arr = {11, 22, 33, 44, 55};
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println (isExist(arr, num));
    }
    public static boolean isExist(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i])
                return true;
        }
        return false;
    }

}
