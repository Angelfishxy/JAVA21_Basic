package com.itheima.test2;

public class GirlFriend {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private int age;

    //set age
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println ("invalid age");
        }
        //get age
    }

    public int getAge() {
        return age;
    }

    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void sleep() {
        System.out.println ("My girlfriend is sleeping");
    }

    public void eat() {
        System.out.println ("My girlfriend is eating");
    }
}
