package ex_30Jan_task;

import java.util.Scanner;

public class CheckTraingle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for A: ");
        int a =sc.nextInt();
        System.out.print("Enter a number for B: ");
        int b =sc.nextInt();
        System.out.print("Enter a number for C: ");
        int c =sc.nextInt();


        if((a+b>c)&& (a+c>b)&& (b+c>c)){
            System.out.println("Enter a valid triangle");
        }else {
            System.out.println("it is not a valid program ");
        }

    }


}
