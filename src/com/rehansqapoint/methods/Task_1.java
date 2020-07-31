package com.rehansqapoint.methods;

public class Task_1 {
    static int i=1;

    public static void main(String[] args) {
        printNumbers(500);
    }

    public static void printNumbers(int n){
        if(i<=n){
            System.out.println(i);
            i=i+1;
            printNumbers(n);
        }
    }


}
