package com.bank;

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Bank {
   
    private int amount;

   
    public Bank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount:");
        this.amount = sc.nextInt();
    }

    
    public void deposit() throws InvalidNumberException {
        if (amount <= 0) {
            throw new InvalidNumberException("Invalid number entered by user");
        } else {
            System.out.println("Amount deposited: " + amount);
        }
    }

    
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.deposit();
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
