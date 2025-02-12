package ex_31Jan_task;

import java.util.Scanner;

public class LoanEligible {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Enter the salary");
        double salary = scanner.nextDouble();
        System.out.println("Enter the credit score");
        int creditScore = scanner.nextInt();

        if (age <= 0) {
            System.out.println("Error: Age must be a positive number.");
        } else if (age < 18 || age > 80) {
            System.out.println("Not Eligible: Age must be between 18 and 80.");
        }
        // Salary Validation
        else if (salary <= 0) {
            System.out.println("Error: Salary must be a positive number.");
        } else if (salary < 30000) {
            System.out.println("Not Eligible: Minimum salary should be 30,000.");
        }
        // Credit Score Validation
        else if (creditScore <= 0) {
            System.out.println("Error: Credit score must be a positive number.");
        } else if (creditScore < 650 || creditScore > 850) {
            System.out.println("Not Eligible: Credit score must be between 650 and 850.");
        }
        // Loan Eligibility Passed
        else {
            System.out.println("Congratulations! You are eligible for a loan.");
        }
    }
}
