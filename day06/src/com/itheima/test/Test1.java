package src.com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        //使用方法重载的思想，设计比较两个整数是否相同
        compare ((byte) 10, (byte) 20);
        compare (10, 20);
    }
    //相同功能的方法名起成一样的名字
    public static void compare(byte b1, byte b2){
        System.out.println ("byte");
        System.out.println (b1 == b2);
    }

    public static void compare(short s1, short s2){
        System.out.println ("short");
        System.out.println (s1 == s2);
    }

    public static void compare(int i1, int i2){
        System.out.println ("int");
        System.out.println (i1 == i2);
    }

    public static void compare(long n1, long n2){
        System.out.println ("long");
        System.out.println (n1 == n2);
    }

}
