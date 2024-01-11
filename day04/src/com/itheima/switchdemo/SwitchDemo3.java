package com.itheima.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        //case穿透
        //break不可以省略,如果没有break，会从匹配到的位置开始，依次向下执行，直到遇到break或者整体结束
        //使用场景：如果多个case执行的代码一致，可以考虑进行case穿透

        int number = 10;
        switch(number){
            case 1:
                System.out.println ("number的值为1");
                break;
            case 10:
                System.out.println ("number的值为10");
                //break;
            case 20:
                System.out.println ("number的值为20");
                break;
            default:
                System.out.println ("没有匹配的值");
                //break;
        }
    }
}
