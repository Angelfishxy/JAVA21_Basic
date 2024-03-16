package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<> ();
        Phone ph1 = new Phone ("xiaomi",1000);
        Phone ph2 = new Phone ("iphone",8000);
        Phone ph3 = new Phone ("chuizi",2999);
        list.add (ph1);
        list.add (ph2);
        list.add (ph3);

        ArrayList<Phone> phoneInfoList = getPhoneInfo (list);
        for (int i = 0; i < phoneInfoList.size (); i++) {
            Phone phone = phoneInfoList.get (i);
            System.out.println (phone.getBrand ()+phone.getPrice ());
        }
    }
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> tmplist = new ArrayList<> ();
        for (int i = 0; i < list.size (); i++) {
            if(list.get (i).getPrice ()<3000){
                tmplist.add(list.get (i));
            }
        }
        return tmplist;
    }
}
