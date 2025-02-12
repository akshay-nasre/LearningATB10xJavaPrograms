package ex_31Jan_task;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the electricity unit");
        int units = scanner.nextInt();

        double billAmount = 0;

        if(units<=100){
            billAmount = units*0.50;
        } else if (units <= 200) {
            billAmount = (100 * 0.50) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            billAmount = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        } else {
            billAmount = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        }
        System.out.println("Electricity Bill Amount: Rs. " + billAmount);
    }

}
