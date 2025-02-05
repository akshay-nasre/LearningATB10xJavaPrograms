package ex_29Jan_Task;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Your age is eligible to vote");
        }else{
            System.out.println("Your age is not eligible to vote");
        }
    }
}
