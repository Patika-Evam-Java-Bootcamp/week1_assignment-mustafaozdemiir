package com.week1;

import java.util.Scanner;

public class Application {

    String s1="Welcome"; // Obje 1
    String s2="Welcome"; // Obje 2
    String s3="Welcome"; // Obje 3
    // 3 Farklı nesne   (Object) oluşturuluyor.
    static String checkValue ="<<code>>";

    static String[] stringArray = {"Mustafa","Mahmut","<<code>>","Fatma","Veysel"};

    public static void main(String[] args){
        System.out.println("Tanımlı value yu içeren String deger: "+checkString(getInputStringArray(5)));
    }

    public static String checkString(String[] stringArray){
        for(String value: stringArray){
            if(value.contains(checkValue)){
                return value;
            }
        }
        return "Value not found";
    }
    public static String[] getInputStringArray(int arrayLength){
        String[] arrays=new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+ arrayLength +" string values.");

        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Value of " +(i+1)+" \n");
            arrays[i] = scanner.nextLine();
        }
        return arrays;
    }
}
