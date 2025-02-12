package ex_31Jan_task;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int remainder;
        int cube;
        int sum=0;
        int temp = number;

        while(number>0){
            remainder = number%10;
            cube = remainder*remainder*remainder;
            sum = sum+cube;
            number = number/10;
        }

        System.out.println(sum);

        if(temp==sum) {
            System.out.println(temp+" =Number is armstrong no");
        }else {
            System.out.println(temp+" =Number is not armstrong no");
        }
    }


}
