package com.itheima.test;

public class Test2Case1 {
    /*给定两个字符串A和B，
    A的旋转是将A最左边字符移动到最右边，如果A能变成B，就返回true，否则返回false
     */
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "adeab";
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
        StringBuilder sb =new StringBuilder ();
        sb.append (str.substring (1)).append (str.charAt (0));
        return sb.toString ();
    }
}
