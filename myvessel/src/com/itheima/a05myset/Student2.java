package com.itheima.a05myset;

public class Student2 implements Comparable <Student2 >{
    //姓名
    private String name;
    //年龄
    private int age;
    //语文成绩
    private int chinese;
    //数学成绩
    private int math;
    //英语成绩
    private int english;


    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    /*返回值为负数：添加元素到左边；
    返回值为正数：添加元素到右边
    返回值为0：当前元素已存在，舍弃
     */
    public int compareTo(Student2 o) {
        //依次按照总分、语文、数学、英语成绩、年龄、姓名进行从低到高排序
        //降序排序：o - this
        //升序排序： this - o

        int sum1 = this.getChinese () + this.getEnglish () + this.getMath ();
        int sum2 = o.getChinese () + o.getEnglish () + o.getMath ();
        int i = sum1 - sum2;
        i = i == 0 ? this.getChinese () - o.getChinese () : i;
        i = i == 0 ? this.getMath () - o.getMath () : i;
        i = i == 0 ? this.getEnglish () - o.getEnglish () : i;
        i = i == 0 ? this.getAge () - o.getAge () : i;
        i = i == 0 ? this.getName ().compareTo (o.getName ()) : i;

        return i;
    }
}
