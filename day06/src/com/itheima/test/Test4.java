package src.com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        //设计方法返回数组最大值
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println (getMax(arr));
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
