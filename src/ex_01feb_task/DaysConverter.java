package ex_01feb_task;

import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total days");
        int totalDays = scanner.nextInt();

        int years = totalDays/365;
        int remainingDays = totalDays%365;
        int months = remainingDays/30;
        int days = remainingDays%30;

        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");

    }
}
