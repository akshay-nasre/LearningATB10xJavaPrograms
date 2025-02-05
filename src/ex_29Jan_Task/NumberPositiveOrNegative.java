package ex_29Jan_Task;

import java.util.Scanner;

public class NumberPositiveOrNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = scanner.nextInt();

        if(number >=0){
            System.out.println(number +" Number is positive");
        }else{
            System.out.println(number + " Number is negative");
        }
    }
}
