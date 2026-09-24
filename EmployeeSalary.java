package Abc;

import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Salary calculations
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;

        double grossSalary = basicSalary + hra + da;

        double tax = grossSalary * 0.05;

        double netSalary = grossSalary - tax;

        // Display salary details
        System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Tax (5%)      : " + tax);
        System.out.println("Net Salary    : " + netSalary);

        sc.close();
    }
}
