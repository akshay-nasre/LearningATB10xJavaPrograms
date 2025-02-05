package ex_29Jan_Task;

import java.util.Scanner;

public class VowelsOrConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");

        char ch1 = scanner.next().charAt(0);
        char ch = Character.toLowerCase(ch1);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("character is vovels");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("character is consonant");
        }else{
            System.out.println("enter the valid character");
        }
    }
}
