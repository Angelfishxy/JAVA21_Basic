package com.itheima.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        RagDoll rd = new RagDoll ();
        rd.eat ();
        rd.drink ();
        rd.catchMouse ();

        System.out.println ("=================================");
        Husky h = new Husky ();
        h.eat ();
        h.drink ();
        h.lookHome ();
        h.breakHome ();
    }
}
