package com.knoldus.Question8;

public class StudentGradingSystem
{
    public static void main(String agrs[])
    {
        Student student1 = new Student();
        student1.setGrade('A');
        System.out.println("The grade of the given student is: "+student1.getGrade());
    }
}
