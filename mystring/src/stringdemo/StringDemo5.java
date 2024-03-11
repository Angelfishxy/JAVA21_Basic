package stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //键盘录入字符串并遍历
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入一个字符串");
        String str = sc.next ();
        for (int i = 0; i < str.length (); i++) {
            System.out.println (str.charAt (i));
        }
    }
}
