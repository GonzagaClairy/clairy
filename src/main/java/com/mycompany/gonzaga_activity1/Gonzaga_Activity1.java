/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gonzaga_activity1;

import java.util.Scanner;

public class Gonzaga_Activity1 {

    public static void main(String[] args) {
        
    java.util.Scanner data = new Scanner (System.in);
    int age;
    String firstName;
    String middleName;
    String lastName;
    String birthday;
    String gender;

    System.out.println("First Name: ");
    firstName = data.nextLine();

    System.out.println("Middle Name: ");
    middleName = data.nextLine();

    System.out.println("Last Name: ");
    lastName = data.nextLine();

    System.out.println("Birthday: ");
    birthday = data.nextLine();

    System.out.println("Gender: ");
    gender = data.nextLine();
    
    System.out.println("Age");
    age = data.nextInt();

    System.out.println("\n" + "First Name: " + firstName + "\n" + "Middle Name: " + middleName + "\n" + 
                    "Last Name: " + lastName + "\n" + "Birthday:  " + birthday + "\n" + "Gender: " + gender + "\n" + "Age:" + age);


    }
}
    

