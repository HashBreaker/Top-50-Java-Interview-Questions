//1. How to reverse a String in Java?


// Bonus Points: Adding null check in the method
// and using StringBuilder for appending the characters.

import java.util.Scanner;

public class Q1ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println(reverseString(inputString));
    }

    private static String reverseString(String IString )  {
        StringBuilder out = new StringBuilder();

            if(IString == null) throw new IllegalArgumentException("-1");


            char[] chars = IString.toCharArray();

            for (int j = IString.length()-1; j >= 0; j--) {
                out.append(chars[j]);
            }
        return out.toString();
    }
}
