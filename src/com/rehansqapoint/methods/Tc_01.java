package com.rehansqapoint.methods;

public class Tc_01 {

    public static void main(String[] args) {

        GenericMethods genericMethods=new GenericMethods();

        genericMethods.launchBrowser();
        genericMethods.clickElement("Register");
        genericMethods.verifyElementExistance("Register");
    RegistrationPage registrationPage=new RegistrationPage();
    registrationPage.FillRegistartionPage();
    registrationPage.verifyUserRegistation();


    }
}
