package ex_30Jan_task;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();

        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+" year is leap year");
        }else{
            System.out.println(year+" year is not leap year");
        }
    }
}
