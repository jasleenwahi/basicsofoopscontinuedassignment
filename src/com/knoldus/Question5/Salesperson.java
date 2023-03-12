package com.knoldus.Question5;

public class Salesperson
{
    int monthlySales;
    int quaterlySales;
    int yearlySales;
    Salesperson(int monthlySales, int quaterlySales, int yearlySales)
    {
        this.monthlySales=monthlySales;
        this.quaterlySales=quaterlySales;
        this.yearlySales=yearlySales;
    }
    int getTotalSales()
    {
        return monthlySales+quaterlySales+yearlySales;
    }

}

