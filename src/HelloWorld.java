import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int a[] = new int[size];

        for(int i=0;i<a.length;i++){
            System.out.println("enter the array elemetnt");
            a[i] = scanner.nextInt();
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
}
