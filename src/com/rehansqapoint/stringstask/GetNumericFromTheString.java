package com.rehansqapoint.stringstask;

public class GetNumericFromTheString {
    public static void main(String[] args) {
        String temp = "";
        String str = "Myamazonorderid789568generatedsucessfully";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (i != str.length() - 1) {
                char currentChar = str.charAt(i);
                char nextChar = str.charAt(i + 1);
                if ((Character.isLetter(currentChar) && Character.isDigit(nextChar))
                        ||
                        (Character.isLetter(nextChar) && Character.isDigit(currentChar))

                ) {
                    temp = temp + currentChar + "@";
                } else {
                    temp = temp + currentChar;
                }
            }


        }
        String arr[]=temp.split("@");
        System.out.println(arr[1]);

    }
}
