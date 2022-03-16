// 4. Java program to check if the given number is Prime?

// We can write a simple program to divide the given number “n” from 2 to n/2 and check the remainder.
// If the remainder is 0, then it’s not a prime number.

public class Q4isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPrime(20));
    }
    public static boolean isPrime(int a){
        if (a == 0 || a == 1) {
            return false;
        }
        if(a == 2){
            return true;
        }
        for (int i = 2; i <= a/2 ; i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
