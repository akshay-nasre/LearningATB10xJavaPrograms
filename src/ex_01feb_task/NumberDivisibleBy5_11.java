package ex_01feb_task;

import java.util.Scanner;

public class NumberDivisibleBy5_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tne number");
        int number = scanner.nextInt();

        if(number%5==0 && number%11==0){
            System.out.println(number +" number is divisible by 5 & 11");
        }else{
            System.out.println(number+ " number is not divisible by 5 & 11");
        }
    }
}
