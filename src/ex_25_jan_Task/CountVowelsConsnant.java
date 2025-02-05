package ex_25_jan_Task;

public class CountVowelsConsnant {

    public static void main(String[] args) {

        String s = "Akshayeihg";
        String a = s.toLowerCase();

        int vowels_count = 0 ;
        int consonant_count = 0 ;
        for(int i=0;i<a.length();i++) {

            if (a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||
                    a.charAt(i)=='o'||a.charAt(i)=='u') {
                vowels_count++;
            } else {
                consonant_count++;
            }
        }
        System.out.println(vowels_count);
        System.out.println(consonant_count);
    }
}
