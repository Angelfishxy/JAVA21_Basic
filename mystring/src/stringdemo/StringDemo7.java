package stringdemo;

public class StringDemo7 {
    //字符串拼接
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str  = arrToString (arr);
        System.out.println (str);
    }

    public static String arrToString(int[] arr){
        if(arr ==null){
            return "";
        }

        if(arr.length == 0){
            return "[]";
        }
        String result ="[";
        for (int i = 0; i < arr.length-1; i++) {
            result = result + arr[i]+", ";
        }
        result = result + arr[arr.length-1]+']';
        return result;
    }
}
