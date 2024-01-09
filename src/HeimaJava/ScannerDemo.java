package HeimaJava;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = scan.nextInt();
        System.out.println("输入的int是："+i);
    }
}
