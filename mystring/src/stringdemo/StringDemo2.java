package stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String ("abc");
        String s2 = "abc";
        String s3 = "Abc";

        System.out.println (s1 == s2);

        // equals or equalsignoeCase
        boolean res1 = s1.equals (s2);
        System.out.println (res1);

        boolean res2 = s1.equalsIgnoreCase (s3);
        System.out.println (res2);
    }
}
