package com.itheima.test2;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role ("乔峰",100,'男');
        Role r2 = new Role ("鸠摩智", 100,'男');
        while(true){
            if(r1.getBlood () == 0){
                System.out.println (r2.getName ()+"K.O"+r1.getName ());
                break;
            }else {
                r1.attack (r2);
            }
            if(r2.getBlood () == 0){
                System.out.println (r1.getName ()+"K.O"+r2.getName ());
                break;
            }else {
                r2.attack (r1);
            }
        }
        //r1.showRoleIfo ();
    }
}
