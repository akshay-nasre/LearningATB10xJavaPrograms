package ex_25_jan_Task;

public class FizzBuzzTest {

    public static void main(String[] args) {

        int number;
        for(number =1;number<=100;number++){

            if(number%3==0){
                System.out.println(number+" fizz");
            } else if (number%5==0) {
                System.out.println(number+" buzz");
            }else{
                System.out.println(number+" ");
            }

        }
    }
}
