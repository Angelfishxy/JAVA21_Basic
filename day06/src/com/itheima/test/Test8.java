package src.com.itheima.test;

public class Test8 {
    //引用数据类型方法传参
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3};
        System.out.println ("调用change前："+ arr[1]);
        change(arr);
        System.out.println ("调用change后："+ arr[1]);
    }

    public static void change(int[] arr){
        arr[1] = 20;
    }
}
