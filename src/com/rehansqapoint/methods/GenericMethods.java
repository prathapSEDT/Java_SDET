package com.rehansqapoint.methods;

public class GenericMethods {

    public void launchBrowser(String browserName){
        switch (browserName){
            case "IE":
                System.out.println("IE Browser is launching");
                break;
            case "CHROME":
                System.out.println("Chrome Browser is launching");
                break;
            case "EDGE":
                System.out.println("Edge Browser is launching");
                break;
            case "FF":
                System.out.println("FF Browser is launching");
                break;
            default:
                System.out.println("invalid browser name");

        }
    }

    public void verifyElementExistance(String elementName){
        System.out.println("Verify elemeny is exist");
    }

    public void clickElement(String element){
        System.out.println("Click the element : "+element);
    }



}
