package ex_31Jan_task;

import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the salary:");
            double salary = sc.nextDouble();
            System.out.println("Enter the years of experience:");
            float experienceYear = sc.nextFloat();
            double bonusAmnt = 0;
            if (experienceYear < 1) {
                System.out.println("No bonus.");
            } else if (experienceYear <= 3) {
                bonusAmnt = 0.05 * salary;
            } else if (experienceYear >= 4 && experienceYear <= 6) {
                bonusAmnt = 0.10 * salary;
            } else {
                bonusAmnt = 0.15 * salary;
            }

            double netPay = salary + bonusAmnt;
            System.out.println("Bonus Amount: Rs. " + bonusAmnt);
            System.out.println("Net Pay (Salary + Bonus): Rs. " + netPay);

    }
}
