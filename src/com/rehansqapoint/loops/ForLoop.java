package com.rehansqapoint.loops;

public class ForLoop {
    public static void main(String[] args) {
        // print the numbers 1-50

        for (int i=1;i<=50;i++)
        {
            System.out.println(i);

            if(i==30){
                continue;
            }

            System.out.println("********   "+i);



        }
    }
}
