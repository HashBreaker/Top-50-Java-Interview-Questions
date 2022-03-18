package com.cogtem;

import java.util.Scanner;

public class Q12FibSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FibSeries(n));
    }
    static int FibSeries(int n){
        int a = 0, b = 1,c;
        if(n == 0){
            return a;
        }
        for (int i = 2; i <= n; i++){
            c = a + b;
            a = b ;
            b = c ;
        }
        return b;
    }
}
