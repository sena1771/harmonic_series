package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("The number: ");
        int a= inp.nextInt();
        double total=0.0;
        for(double i=1;i<=a;i++) {
            total+=(1/i); //or settle this like 1.0/i
        } System.out.print("Sum of the Harmonic series:  "+total);
    }
}
