//10. Sorting an array in Java?

// This question requires a deep understanding of sorting in Java.
// If you look at the Arrays utility class, there are many overloaded sort() methods to sort primitive as well as to object arrays.

// If you are sorting a primitive array in the natural
// order, then it’s very simple. Just use the Arrays.sort() method.

import java.util.Arrays;

public class Q10SortArray {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,1,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
