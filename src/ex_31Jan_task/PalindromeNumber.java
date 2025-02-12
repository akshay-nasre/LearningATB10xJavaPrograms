package ex_31Jan_task;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thde number");
        int number = scanner.nextInt();
        int temp = number;
        int reverse = 0;

        while(number>0){
            int digit = reverse*10;
            reverse =number%10+digit;
            number = number/10;
        }
        System.out.println(reverse);

        if(reverse == temp){
            System.out.println(reverse + " Number is palindrome number");
        }else{
            System.out.println(reverse + " Number is not palindrome number");
        }

    }
}
