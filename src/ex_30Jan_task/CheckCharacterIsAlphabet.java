package ex_30Jan_task;

import java.util.Scanner;

public class CheckCharacterIsAlphabet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);

        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println(ch + " Character is alphabet");
        }else{
            System.out.println(ch + " Character is not alphabet");
        }
    }
}
