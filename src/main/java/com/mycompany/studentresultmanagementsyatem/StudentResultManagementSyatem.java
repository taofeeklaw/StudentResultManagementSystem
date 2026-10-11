/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.studentresultmanagementsyatem;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StudentResultManagementSyatem {

    public static void main(String[] args) {
        double firstSubject, secondSubject, thirdSubject, fourthSubject, fifthSubject,
                totalScore, average;
        String studentName, grade, status;

        System.out.println("This program manage student results");

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("What is your Name");
        studentName = inputScanner.next();
        System.out.println("Input your score in Mathematics");
        while (true) {
            while (!inputScanner.hasNextDouble()) {
                System.out.println("Invalid Input! Enter a Number:");
                inputScanner.next();
            }
            firstSubject = inputScanner.nextDouble();
            if (firstSubject >= 0 && firstSubject <= 100) {
                break;
            }
            System.out.println("Invalid Score! Enter a score from 0 to 100");
        }

        System.out.println("Input your score in English Language");

        while (true) {
            while (!inputScanner.hasNextDouble()) {
                System.out.println("Invalid Input! Enter a Number:");
                inputScanner.next();
            }
            secondSubject = inputScanner.nextDouble();
            if (secondSubject >= 0 && secondSubject <= 100) {
                break;
            }
            System.out.println("Invalid Score! Enter a score from 0 to 100");
        }

        System.out.println("Input your score in Physics");
        while (true) {
            while (!inputScanner.hasNextDouble()) {
                System.out.println("Invalid Input! Enter a Number:");
                inputScanner.next();
            }
            thirdSubject = inputScanner.nextDouble();
            if (thirdSubject >= 0 && thirdSubject <= 100) {
                break;
            }
            System.out.println("Invalid Score! Enter a score from 0 to 100");
        }

        System.out.println("Input your score in Chemistry");
        while (true) {
            while (!inputScanner.hasNextDouble()) {
                System.out.println("Invalid Input! Enter a Number:");
                inputScanner.next();
            }
            fourthSubject = inputScanner.nextDouble();
            if (fourthSubject >= 0 && fourthSubject <= 100) {
                break;
            }
            System.out.println("Invalid Score! Enter a score from 0 to 100");
        }

        System.out.println("Input your score in Biology");
        while (true) {
            while (!inputScanner.hasNextDouble()) {
                System.out.println("Invalid Input! Enter a Number:");
                inputScanner.next();
            }
            fifthSubject = inputScanner.nextDouble();
            if (fifthSubject >= 0 && fifthSubject <= 100) {
                break;
            }
            System.out.println("Invalid Score! Enter a Number");
        }
        totalScore = firstSubject + secondSubject + thirdSubject + fourthSubject + fifthSubject;
        average = totalScore / 5;

        if (average >= 70) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else if (average >= 45) {
            grade = "D";
        } else if (average >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        if (average >= 40) {
            status = "PASS";
        } else {
            status = "FAIL";
        }

        System.out.println("Student name: " + studentName);
        System.out.println("Your Mathematics Score is: " + firstSubject);
        System.out.println("Your English Score is: " + secondSubject);
        System.out.println("Your Physics Score is: " + thirdSubject);
        System.out.println("Your Chemistry Score is: " + fourthSubject);
        System.out.println("Your Biology Score is: " + fifthSubject);
        System.out.println("Total Score = " + totalScore + "/500");
        System.out.println("Average = " + average + "%");
        System.out.println("Grade = " + grade);
        System.out.println("Status = " + status);
    }
}
