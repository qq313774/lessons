package com.example.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int dayOfWeek;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of week (1-7):  ");
        dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error. Enter a number from 1 to 7.");



        }


    }
}
