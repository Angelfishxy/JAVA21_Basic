package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = list.get(0).getAge ();

        for (int i = 1; i < list.size (); i++) {
            max = max<list.get(i).getAge () ? list.get(i).getAge () : max;
        }
        return max;
    }
}
