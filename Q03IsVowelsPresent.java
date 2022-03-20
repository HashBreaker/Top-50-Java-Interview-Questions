// 3. Java Program to check if a vowel is present in the string?
// We can use regular expression to check if the string contains vowels or not.

import java.util.Locale;
import java.util.Scanner;

public class Q3IsVowelsPresent {

    static boolean isContainsVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        isContainsVowel(input);

    }
}
