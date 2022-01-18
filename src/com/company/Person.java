package com.company;

public class Person {
    int age = 20;

    int weight = 62;
    int height = 160;

    int[] size = {weight,height};//array

    String name="Jared";

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public int[] size(){
        return size;
    }


}
