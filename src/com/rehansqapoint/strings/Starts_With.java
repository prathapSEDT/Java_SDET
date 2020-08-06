package com.rehansqapoint.strings;

public class Starts_With {
    public static void main(String[] args) {
        String str="Error: User can not added to the system";

        if (str.startsWith("Error"))
        {
            System.out.println("String starts with error value");
        }else {
            System.out.println("String does not starts-with error value");
        }
        

        if(str.endsWith("system")){
            System.out.println("String ends with system");
        }

    }
}
