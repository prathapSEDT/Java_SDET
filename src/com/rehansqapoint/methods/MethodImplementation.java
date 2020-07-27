package com.rehansqapoint.methods;

public class MethodImplementation {


    public static int add(int a, int b){
        return a+b;
    }
    public  void sub(){

        int a=10;
        int b=20;
        System.out.println(a-b);

    }

    public static void main(String[] args) {

       int result=MethodImplementation.add(10,50);
        System.out.println("The sum of two numbers is "+result);


    }

}
