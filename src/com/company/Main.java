package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bitte geben Sie Ihren Vorname ein:");
        Scanner sc1 = new Scanner(System.in);
        String firstName;
        firstName = sc1.next();

        System.out.println("Bitte geben Sie jetzt Ihren Nachnamen ein:");
        Scanner sc2 = new Scanner(System.in);
        String lastName;
        lastName = sc2.next();

        System.out.println("Bitte geben Sie noch Ihr Alter ein:");
        Scanner sc3 = new Scanner(System.in);
        int age;
        age = sc3.nextInt();

        System.out.println("Ihre Registrierung lautet: " + firstName + " " + lastName + ", und Sie sind " + age + " Jahre alt!");

    }
}
