package ex_25_jan_Task;

public class StringPalindrome {

    public static void main(String[] args) {

        String s = "Akshayahska";
        String str = s.toLowerCase();

        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);

        if(str.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("Non Palindrome");
        }
    }
}
