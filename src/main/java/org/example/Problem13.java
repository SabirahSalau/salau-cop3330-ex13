/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;
import java.util.Scanner;

public class Problem13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //INPUTS
        System.out.println("What is the principal amount?");
        double principal = input.nextDouble();

        System.out.println("What is the rate?");
        double rate = input.nextDouble();

        System.out.println("What is the number of years?");
        double years = input.nextDouble();

        System.out.println("What is the number of times the interest is compounded per year?");
        double numbTimes = input.nextDouble();


        //CALCULATIONS
        double nRate = rate/100;
        double first = (1 + nRate/numbTimes);
        double exp = numbTimes * years;
        double power = Math.pow(first, exp);
        double amount = power * principal;

        //OUTPUT
        System.out.printf("$" + principal + " invested at " + rate + "%% for " + years + " years compounded " + numbTimes + " times per year is $%.2f", amount);
    }
}
