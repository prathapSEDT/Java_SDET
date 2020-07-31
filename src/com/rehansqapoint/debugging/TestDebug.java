package com.rehansqapoint.debugging;

public class TestDebug {
    public static void main(String[] args) {
        int a=10;

        int b=20;

        int result=a+b;

        result=a*b;

        result=(a+b)*(a-b);

        System.out.println(result);

        Methods_Impl methods=new Methods_Impl();
        methods.add(a,b);

        System.out.println("Execution Completed...!!!!");
    }
}
