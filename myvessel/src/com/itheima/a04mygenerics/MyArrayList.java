package com.itheima.a04mygenerics;

import java.util.Arrays;

//自定义泛型类
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString (){
        return Arrays.toString (obj);
    }
}
