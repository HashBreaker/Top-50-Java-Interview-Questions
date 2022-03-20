//2. How to swap two numbers without using a third variable?


import java.util.Scanner;

public class Q2Swap2NumWithoutVar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        swap(a,b);

    }
    private static void swap(int a,int b){
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(a + " <> " + b);
    }
}
