package com.company;

public class Main extends Person {// class

    int sum;//our global variable
    int quotient;

    private void Sum(int A, int B){//function with paremeters
        sum=A+B;//assign values to our g v
        System.out.println("SUM=\t"+sum);
    }

    public static void main(String[] args) {//main fuction
	// write your code here
        Main person = new Main();
        int age = person.getAge();
        String name= person.getName();

        int size[] = person.size();

        mult obj = new mult();
        obj.product_name();
        Sum obj2 = new Sum();
        obj2.division();

        System.out.println("Welcome back,\t"+ name+"\tyour age is\t"+age +"\tyour height is\t"+size[1]+"\t and your weight is\t"+size[0]);

     }
}
