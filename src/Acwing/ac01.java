package Acwing;

import java.util.Scanner;

public class ac01 {
    public static void main(String[] args){
        int a,b;
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a+b);
        }
    }
}
