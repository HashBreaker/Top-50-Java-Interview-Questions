package com.cogtem;

import sun.nio.ch.sctp.SctpMultiChannelImpl;

import java.util.Scanner;

public class Q3AmstNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isAmstrongNum(input));

    }
    static boolean isAmstrongNum(int input){
        boolean result = false;
        int AmstNum = 0;
        int inputNo = input;
        while( input != 0){
            int digit = input%10;
            AmstNum = AmstNum + ( digit *digit *digit);
            input/=10;
        }
        if (AmstNum == inputNo) {
            return true;
        }
        return result;
    }
}
