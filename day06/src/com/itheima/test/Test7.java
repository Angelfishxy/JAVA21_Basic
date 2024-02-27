package src.com.itheima.test;

public class Test7 {
    //方法的传参
    public static void main(String[] args) {
        int number = 100;
        System.out.println ("调用change前："+number);
        number = change(number);
        System.out.println ("调用change后："+number);
    }

    public static int change(int number){
        number = 200;
        return number;
    }
}
