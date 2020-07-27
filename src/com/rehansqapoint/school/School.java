package com.rehansqapoint.school;

public class School {

    int  id=1;

    public static void addStudentData(String stdName,String standard,int age){
        School school=new School();
        System.out.println("Adding student details : Name -> "+stdName+" Standard :->"+standard+" Age is :-> "+age+" The ID is :->"+school.id);
        school.id=school.id+1;
    }

}
