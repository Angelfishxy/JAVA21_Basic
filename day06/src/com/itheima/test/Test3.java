package src.com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //设计方法用于数组遍历
        int[] arr = {11, 22, 33, 44, 55};
        printArray (arr);
    }

    public static void printArray(int[] arr) {
        System.out.print ("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println ("]");
    }
}
