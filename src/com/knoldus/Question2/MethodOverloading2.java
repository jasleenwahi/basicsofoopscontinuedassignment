package com.knoldus.Question2;

import java.util.Scanner;

public class MethodOverloading2
{
    //method overloading is being demonstrated
    static void print(int number)
    {
        System.out.println("The function is printing a number: "+number);
    }
    static void print(String text)
    {
        System.out.println("The function is printing a string: "+text);
    }
    public static void main(String args[])
    {
        int number;
        String text;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a number");
        number = takeInput.nextInt();
        System.out.println("Enter a string");
        text = takeInput.nextLine();
        text = takeInput.nextLine();
        MethodOverloading2.print(number);
        MethodOverloading2.print(text);
    }
}
