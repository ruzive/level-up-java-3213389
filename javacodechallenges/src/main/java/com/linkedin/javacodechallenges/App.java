package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double minTwoCCF = 1496.00;
        double minTwoAmt = 18.84;
        double oneCCF = 748.00;
        double oneAmt = 3.90;
        double usagebill = minTwoAmt;
        // means we get charged the minimum amount
        if (minTwoCCF < gallonsUsage) {
            double c = gallonsUsage - minTwoCCF;
            double b = Math.ceil(c / oneCCF);
            usagebill = minTwoAmt + (oneAmt * b);
        }
        // TODO: Implement method
        return usagebill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
