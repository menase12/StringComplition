package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name, breed;
        int age;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Greetings. What is your pet's name? ");
        name=keyboard.next();
        System.out.print("What kind of animal is? ");
        breed=keyboard.next();
        System.out.print("How old is your pet? ");
        age=keyboard.nextInt();
        System.out.print(name+" is your "+breed+" and it is "+age+" years old.");

    }
}
