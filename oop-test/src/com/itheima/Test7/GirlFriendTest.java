package com.itheima.Test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr= new GirlFriend[4];
        GirlFriend gf1=new GirlFriend ("xiaoshishi",18,"mengmeizi","chilingshi");
        GirlFriend gf2=new GirlFriend ("xiaodandan",19,"mengmeizi","play games");
        GirlFriend gf3=new GirlFriend ("xiaoshishi",20,"mengmeizi","study");
        GirlFriend gf4=new GirlFriend ("xiaoshishi",21,"hanmeizi","sleep");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge ();
        }
        int avg = sum/arr.length;
        System.out.println ("average age:"+avg);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge ()<avg) {
                System.out.println (gf.getName () + ", " + gf.getAge () + ", " + gf.getGender () + ", " + gf.getHobby ());
                count++;
            }
        }
        System.out.println (count+"个");
    }
}
