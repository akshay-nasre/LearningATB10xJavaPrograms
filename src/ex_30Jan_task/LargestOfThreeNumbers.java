package ex_30Jan_task;

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int number3 = scanner.nextInt();

        if(number1>number2 && number1>number3){
            System.out.println(number1 + " number is largest number");
        } else if (number2 > number3) {
            System.out.println(number2 + " number is largest number");
        }else{
            System.out.println(number3 + " number is largest number");
        }


    }
}
