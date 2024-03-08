package com.itheima.test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods ("001","HuaiweiP40",5599,100);
        Goods g2 = new Goods ("002","保温杯",226,100);
        Goods g3 =new Goods ("003","枸杞",12.7,50);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods good =arr[i];
            System.out.println (good.getId () +","+good.getName ()  +","+good.getPrice ()+","+good.getCout () );
        }

    }
}
