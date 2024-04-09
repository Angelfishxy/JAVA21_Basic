package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student ();
        s.setName ("zhangsan");
        s.setAge (18);

        Teacher t = new Teacher ();
        t.setName ("wangjianguo");
        t.setAge (56);

        Administrator admin = new Administrator ();
        admin.setName ("guanliyuan");
        admin.setAge (35);

        register (s);
        register (t);
        register (admin);
    }
    public static void register(Person p){
        p.show();
    }
}
