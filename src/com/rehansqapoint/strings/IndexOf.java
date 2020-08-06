package com.rehansqapoint.strings;

public class IndexOf {
    public static void main(String[] args) {
        String str="c:/prathap/SDET";

        int pos=str.lastIndexOf("/")+1;
        System.out.println(str.substring(pos));
    }
}
