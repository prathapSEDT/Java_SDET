package com.rehansqapoint.arrays;

public class ArraysImpl {
    public static void main(String[] args) {
        String[] arr=new String[4];
        arr[0]="india";
        arr[1]="china";
        arr[2]="japan";
        arr[3]="america";


        //here index will total size-1
        //System.out.println(arr[2]);//retrive value based on index
//
//        for (int i=0;i<= arr.length-1;i++)
//        {
//            System.out.println(arr[i]);
//        }

        for (String item:arr) {
            System.out.println(item);
        }


    }
}
