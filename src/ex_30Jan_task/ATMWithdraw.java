package ex_30Jan_task;

import java.util.Scanner;

public class ATMWithdraw {

    public static void main(String[] args) {

        int account_amount = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdraw amount");
        int withdraw_amount = scanner.nextInt();

        if(withdraw_amount<0){
            System.out.println("Error: Amount should not be greater then zero");
        } else if (withdraw_amount%100!=0) {
            System.out.println("Error : Amount should multiple of 100");
        }else if (withdraw_amount> account_amount){

            System.out.println("Error: Insufficient balance.");
        }
        else{
            account_amount= account_amount-withdraw_amount;
            System.out.println("withdrawal successfully remaining balance  is "+account_amount);
        }

    }
}
