package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Before swapping: a = " + a + "; b = " + b);
         int ab = a; a = b; b = ab;
        System.out.println("After swapping: a = " + a + "; b = " + b);
    }
}
