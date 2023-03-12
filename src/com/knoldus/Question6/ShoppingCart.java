package com.knoldus.Question6;

import com.knoldus.Question5.Salesperson;

public class ShoppingCart
{
    double totalCost=0;

    double getTotal(Item item) //using aggregation
    {
        totalCost= totalCost+(item.quantity*item.cost);
        return totalCost;
    }
    public static void main(String args[])
    {
        Item item1 = new Item(200, 3);
        Item item2 = new Item(350, 2);
        ShoppingCart shoppingcart = new ShoppingCart();
        double total = shoppingcart.getTotal(item1)+shoppingcart.getTotal(item2);
        System.out.println("The total of the cart is: "+total);
    }
}
