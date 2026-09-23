package Abc;

import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;
    double total, percentage;
    char grade;

    void getData(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        marks3 = sc.nextInt();

        calculateResult();
    }

    void calculateResult() {
        total = marks1 + marks2 + marks3;
        percentage = total / 3.0;

        if (percentage >= 75)
            grade = 'A';
        else if (percentage >= 60)
            grade = 'B';
        else if (percentage >= 50)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayData() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Subject 1   : " + marks1);
        System.out.println("Subject 2   : " + marks2);
        System.out.println("Subject 3   : " + marks3);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage);
        System.out.println("Grade       : " + grade);

        if (grade == 'F')
            System.out.println("Result      : FAIL");
        else
            System.out.println("Result      : PASS");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.getData(sc);
        s.displayData();

        sc.close();
    }
}
