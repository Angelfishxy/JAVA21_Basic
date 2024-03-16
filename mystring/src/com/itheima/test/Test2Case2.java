package com.itheima.test;

public class Test2Case2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < strA.length (); i++) {
            if(strB.equals (strA)){
                flag = true;
                break;
            }else{
                strA = rotate (strA);
                count++;
            }
        }
        System.out.println ("经过"+count+"次旋转后结果为："+flag);

    }
    public static String rotate(String str){
        char[] arr = str.toCharArray ();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
        String result = new String (arr);
        return  result;
    }
}
