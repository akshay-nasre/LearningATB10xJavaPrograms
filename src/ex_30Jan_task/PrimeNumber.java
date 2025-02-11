package ex_30Jan_task;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        int number = scanner.nextInt();

        int count = 0;

        for(int i =2;i<=number-1;i++){
            if(number%i==0){
                count++;
            }
        }

        if(count == 0){
            System.out.println(number+" number is prime number");
        }else{
            System.out.println(number+" number is not prime number");
        }
    }
}
