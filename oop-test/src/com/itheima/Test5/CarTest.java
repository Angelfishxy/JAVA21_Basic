package com.itheima.Test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car ();
            System.out.println ("请输入汽车品牌");
            c.setBrand (sc.next ());
            System.out.println ("请输入汽车价格");
            c.setPrice (sc.nextInt ());
            System.out.println ("请输入汽车颜色");
            c.setColor (sc.next ());

            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println (car.getBrand () + ", " + car.getPrice () + ", " + car.getColor ());

        }
    }
}
