// 7. Palindrome Check

// A palindrome string is one whose reverse is also the same string. So we can reverse
// the input string and check if both strings are equal or not.
// We can also use the String charAt(int index) method to check for palindrome string.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q7palindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "abcba";
        System.out.println(isPalidromic(input));
    }
    public static boolean isPalidromic(String string){
        boolean result = false;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i) != string.charAt(string.length() - i -1)){
                result = false;
                break;
            }
        }
        return result;
    }
}
