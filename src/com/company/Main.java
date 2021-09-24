package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Baseball example = new Baseball();
        System.out.println("Baseball Finance Info");
        example.userPrompt();
        System.out.println(example.toString());
        example.budgetCheck();

    }
}
