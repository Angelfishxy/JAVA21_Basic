package com.itheima.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z1 =new Zi ();
        Zi z2 = new Zi ();
    }
}

class Fu{
    String name;
    int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{
    //子类不可继承父类的构造方法
}
