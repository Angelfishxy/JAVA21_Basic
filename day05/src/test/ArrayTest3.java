package test;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*定义一个数组，存储1-10，遍历数组里的元素：
        如果是奇数，则将当前数字扩大两倍；
        如果是偶数，则将当前数字变为二分之一
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i] /= 2;
                System.out.println (arr[i]);
            }else{
                arr[i] *= 2;
                System.out.println (arr[i]);
            }
        }
    }
}
