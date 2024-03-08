package com.itheima.Test6;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1=new Phone ("xiaomi",1999,"white");
        Phone p2 = new Phone ("huaiwei",5999,"black");
        Phone p3 = new Phone ("iphone",8899,"pink");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice ();
        }
        int avg = sum/arr.length;
        System.out.println (avg);
    }
}
