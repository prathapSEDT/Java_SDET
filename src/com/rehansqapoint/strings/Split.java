package com.rehansqapoint.strings;

public class Split {
    public static void main(String[] args) {
        String str="india;china;america;kashmir";
        String [] arr=str.split(";");

        for (String item:arr) {
            System.out.println(item);
        }
    }
}
