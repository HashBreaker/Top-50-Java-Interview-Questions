//6. Check if a List of integers contains only odd numbers?

// We can use for loop and check each element one by one if they are odd or not.

import java.util.Scanner;

public class Q6OddNumOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrOdd = {1,5,9,3};

        int[] arrEven = {2,4,6,8,10};
        System.out.println(isConatainsOdd(arrEven));
        System.out.println(isConatainsOdd(arrOdd));


    }

    private static boolean isConatainsOdd(int[] arr) {
        boolean result = true;
        for (int i : arr) {
            if(i% 2 == 0){
                return false;
            }
        }
        return result;
    }
}
