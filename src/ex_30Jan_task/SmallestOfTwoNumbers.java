package ex_30Jan_task;

import java.util.Scanner;

public class SmallestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();

        if(number1<number2 ){
            System.out.println(number1 + " number is smallest number");
          }else{
            System.out.println(number2 + " number is smallest number");
        }


    }
}
