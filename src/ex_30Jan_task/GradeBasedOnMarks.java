package ex_30Jan_task;

import java.util.Scanner;

public class GradeBasedOnMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();

        if(marks>=0 && marks <=100){
            if(marks>=90){
                System.out.println("You have A+ grade");
            } else if (marks>=80) {
                System.out.println("You have A grade");
            } else if (marks>=70) {
                System.out.println("You have B grade");
            } else if (marks>=60) {
                System.out.println("You have C grade");
            } else if (marks>=50) {
                System.out.println("You have D grade");
            }else if (marks>=40){
                System.out.println("You have E grade");
            }else{
                System.out.println("You have F grade");
            }
        }else{
            System.out.println("Please enter number within 0 to 100");
        }
    }
}
