package com.itheima.Test8;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student (1, "zhaoxinyu", 23);
        Student stu2 = new Student (2, "zhangsan", 24);
        Student stu3 = new Student (3,"wangwu",21);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student (4, "zhaosi", 18);
        boolean flag = contains (arr, stu4);
        if (flag) {
            System.out.println ("id has been existed");
        } else {

            int count = getCount (arr);
            if (count == arr.length) {
                Student[] arr1 = creatNewArr (arr);
                int index = getCount (arr1);
                arr1[index] = stu4;
                arr = arr1;
            } else {
                arr[count] = stu4;
            }
            printArr(arr);
        }
        //删除
        int index = getIndex (arr,6);
        if(index>=0){
            arr[index] = null;
            printArr (arr);
        }else{
            System.out.println ("failed to delete id");
        }

        int aimindex = getIndex (arr,3);
//        System.out.println (aimindex);
        if(aimindex >=0){
            arr[aimindex].setAge (arr[aimindex].getAge ()+1);
            printArr (arr);
        }else{
            System.out.println ("failed to added age");
        }
    }

    public static boolean contains(Student[] arr, Student student) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && student != null && student.getId () == arr[i].getId ()){
                return true;
            }
        }
        return false;
    }

    public static Student[] creatNewArr(Student[] arr) {
        Student[] arr1 = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                count++;
        }
        return count;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println (arr[i].getId () + ", " + arr[i].getName () + ", " + arr[i].getAge ());
            }
        }
        System.out.println ();
    }

    public static int getIndex(Student[] arr ,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null) {
                int sid = stu.getId ();
                if(id == sid)
                    return i;
            }
        }
        return -1;
    }
}
