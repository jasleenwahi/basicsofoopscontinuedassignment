package com.knoldus.Question1;

import java.util.Scanner;

public class MethodOverloading1
{
    //method overloading is being demonstrated
    static int add(int number1, int number2)
    {
        return number1+number2;
    }
    static int add(int number1, int number2, int number3)
    {
        return number1+number2+number3;
    }
    public static void main(String args[])
    {
        int number1;
        int number2;
        int number3;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        number1 = takeInput.nextInt();
        System.out.println("Enter number 2: ");
        number2 = takeInput.nextInt();
        System.out.println("Enter number 3: ");
        number3 = takeInput.nextInt();
        System.out.println("The result of addition of 2 numbers: "+MethodOverloading1.add(number1,number2));
        System.out.println("The result of addition of 3 numbers: "+MethodOverloading1.add(number1,number2,number3));

    }

}
