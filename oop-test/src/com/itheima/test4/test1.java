package com.itheima.test4;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) { 
            String str = sc.nextLine();
            int count = 0;
            while(str.length()>0){
                String[] arr = str.split("");
                int tmp = Integer.valueOf(arr[0].charAt (0));
                if(tmp>=0 && tmp<=127){
                    count++;
                }
                str = str.replace(arr[0],"");
            }
            System.out.println(count);
        }
    }
}