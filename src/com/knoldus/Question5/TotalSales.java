package com.knoldus.Question5;

public class TotalSales
{
    //using aggregation
    Salesperson salesperson;
    TotalSales(Salesperson salesperson)
    {
        this.salesperson = salesperson;
    }
    public static void main(String agrs[])
    {
        Salesperson salesperson1 = new Salesperson(30, 40, 50);
        TotalSales totalSales1 = new TotalSales(salesperson1);
        System.out.println("The total sales made by salesperson 1: "+totalSales1.salesperson.getTotalSales());

    }
}
