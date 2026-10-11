package com.mycompany.studentresultmanagementsyatem;

import java.util.Scanner;

public class StudentResultManagementSyatem {

    public static void main(String[] args) {
        double firstSubject, secondSubject, thirdSubject, fourthSubject, fifthSubject,
                totalScore, average;
        String studentName, grade, status;

        System.out.println("This program manage student results");

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("What is your Name");
        studentName = inputScanner.nextLine();
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

        
System.out.println("========================================");
System.out.println("       STUDENT RESULT REPORT");
System.out.println("========================================");
System.out.println("Student Name : " + studentName);
System.out.println();
System.out.printf("%-22s %s%n", "SUBJECT", "SCORE");
System.out.println("----------------------------------------");
System.out.printf("%-22s %6.0f%n", "Mathematics", firstSubject);
System.out.printf("%-22s %6.0f%n", "English Language", secondSubject);
System.out.printf("%-22s %6.0f%n", "Physics", thirdSubject);
System.out.printf("%-22s %6.0f%n", "Chemistry", fourthSubject);
System.out.printf("%-22s %6.0f%n", "Biology", fifthSubject);
System.out.println("----------------------------------------");
System.out.printf("%-22s %.0f / 500%n", "Total Score", totalScore);
System.out.printf("%-22s %.2f%%%n", "Average", average);
System.out.println("Grade                " + grade);
System.out.println("Status               " + status);
System.out.println("========================================");

    }
}
