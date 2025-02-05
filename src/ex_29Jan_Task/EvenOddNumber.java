package ex_29Jan_Task;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = scanner.nextInt();

        if(number >=0){

        if(number%2==0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number + " is odd number");
        }

        }else{
            System.out.println(number + " is negative number please provide positive number");
        }
    }
}
