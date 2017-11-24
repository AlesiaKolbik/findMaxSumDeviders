package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два натуральных числа: ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int nextResult = 0;
        if (numOne > numTwo) {
            int numThree = numOne;
            numOne = numTwo;
            numTwo = numThree;
        }
        for (int i = numOne; i <= numTwo; i++) {
            int firstResult = findSumDivider(i);
            int max = Math.max(firstResult, nextResult);
            nextResult = max;
        }
        System.out.println(nextResult);
    }

    public static int findSumDivider(int number) {
        int sum = 0;
        for (int i = number; i > 0; i--) {
            if (i == 0) {
                break;
            }
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
