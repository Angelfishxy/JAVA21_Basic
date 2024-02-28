package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    /*机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价、月份和头等舱或经济舱：
    旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月-次年4月）头等舱7折，经济舱6.5折。*/
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入机票的价格：");
        int price = sc.nextInt ();
        System.out.println ("请输入当前月份：");
        int month = sc.nextInt ();
        System.out.println ("请输入购买的舱位，1表示头等舱，2表示经济舱：");
        //1表示头等舱，2表示经济舱
        int seat = sc.nextInt ();
        int fund = 0;
        if(month>=5 && month<=10){
            //旺季
            fund = getFund (seat, fund, price, 0.9, 0.85);
        }else if((month>=11 && month<= 12) ||(month>=1 && month<=4)){
            //淡季
            fund = getFund (seat, fund, price, 0.7, 0.65);
        }else{
            System.out.println ("月份非法");
        }
        System.out.println (fund);
    }

    private static int getFund(int seat, int fund, int price, double x, double x1) {
        if (seat == 1) {
            fund = (int) (price * x);
        } else if (seat == 2) {
            fund = (int) (price * x1);
        } else {
            System.out.println ("没有这个舱位");
        }
        return fund;
    }
}
