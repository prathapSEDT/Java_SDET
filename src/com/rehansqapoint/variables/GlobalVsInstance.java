package com.rehansqapoint.variables;

public class GlobalVsInstance {

    final int a;
    int b=30;




    public static void main(String[] args) {
        GlobalVsInstance globalVsInstance =new GlobalVsInstance();

        globalVsInstance.add();
    }


    public  void add(){
        final int results;
        int a=50;
        int b=30;
        System.out.println(a+b);// local variables
        System.out.println(this.a+this.b);// take the class level global variables
        this.a=45;
    }



}
