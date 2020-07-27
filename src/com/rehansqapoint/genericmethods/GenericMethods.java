package com.rehansqapoint.genericmethods;

import com.rehansqapoint.staticvsinstance.StaticVsInstance;

public class GenericMethods {

    static int id=10;
    int age=20;


    public static void addStudent(){
        System.out.println("Adding student to the datatbase with the id "+ GenericMethods.id);
    }

    public static void getStudentByAge(){
        GenericMethods genericMethods =new GenericMethods();
        System.out.println("Getting student deatils by age group"+genericMethods.age);
    }

}
