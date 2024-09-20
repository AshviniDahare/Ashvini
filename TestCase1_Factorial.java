package com.factorial;

public class TestCase1_Factorial {
   
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;
        long result = factorial(number);
        
        System.out.println("The factorial of " + number + " is " + result);
    }
}
