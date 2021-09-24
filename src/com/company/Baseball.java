package com.company;

import java.util.Scanner;

public class Baseball extends Sport
{
    protected double batCost;
    protected double gloveCost;

    public Baseball()
    {
        ballType = "Baseball";
    }

    public Baseball(int players, double ballCost, double yearlyBudget, double batCost, double gloveCost)
    {
        ballType = "Baseball";
        players = this.players;
        ballCost = this.ballCost;
        yearlyBudget = this.yearlyBudget;
        batCost = this.batCost;
        gloveCost = this.gloveCost;
    }

    public void userPrompt()
    {
        super.userPrompt();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cost per bat: ");
        batCost = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the cost per glove: ");
        gloveCost = Double.parseDouble(scan.nextLine());

        this.calculateCost();
    }

    public void calculateCost()
    {
        int ballCount = players / 3;
        yearlyCost += ballCount * ballCost;

        double batTotal = batCost * players;
        double gloveTotal = gloveCost * players;
        yearlyCost += (batTotal + gloveTotal);
    }

    public double getBatCost()
    {
        return batCost;
    }

    public void setBatCost(double temp)
    {
        batCost = temp;
    }

    public double getGloveCost()
    {
        return gloveCost;
    }

    public void setGloveCost(double temp)
    {
        gloveCost = temp;
    }
}
