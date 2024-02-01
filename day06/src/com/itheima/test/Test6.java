package src.com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        //copy array
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] temp = copyOfRange (arr,3, 6);
        for (int i = 0; i < temp.length; i++) {
            System.out.print (temp[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] copy = new int[to - from];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = arr[from + i];
        }
        return copy;
    }
}
