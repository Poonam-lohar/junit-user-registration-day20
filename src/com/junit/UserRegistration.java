package com.junit;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = scan.nextLine();
        System.out.println("Enter last name:  ");
        String lastName = scan.nextLine();
        System.out.println("first name is : " + firstName);
        System.out.println("first name is : " + firstName(firstName));
        System.out.println("first name is : " + lastName);
        System.out.println("first name is : " + lastName(lastName));
    }
        private static boolean firstName (String firstName){
            return firstName.matches("[A-Z]{1}[a-z]{3,}");
        }
        private static boolean lastName(String lastName) {
        return lastName.matches("[A-Z]{1}[a-z]{3,}");
    }
    }
