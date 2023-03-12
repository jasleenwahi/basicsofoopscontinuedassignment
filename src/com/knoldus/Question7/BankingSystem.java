package com.knoldus.Question7;

import java.util.Scanner;

public class BankingSystem
{
    public static void main(String args[])
    {
        Customer customer1 = new Customer();
        double accountBalance=2000;
        customer1.setAccountBalance(accountBalance);
        System.out.println("The account balance of customer is: "+customer1.getAccountBalance());
    }
}
