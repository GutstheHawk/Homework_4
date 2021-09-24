package com.company;

import java.util.Scanner;

public class Hockey extends Sport
{
    protected double stickCost;
    protected double skateCost;

    public Hockey()
    {
        ballType = "Puck";
    }

    public Hockey(int players, double ballCost, double yearlyBudget, double stickCost, double skateCost)
    {
        ballType = "Puck";
        players = this.players;
        ballCost = this.ballCost;
        yearlyBudget = this.yearlyBudget;
        stickCost = this.stickCost;
        skateCost = this.skateCost;
    }

    public void userPrompt()
    {
        super.userPrompt();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cost per stick: ");
        stickCost = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the cost per skate: ");
        skateCost = Double.parseDouble(scan.nextLine());
    }

    public void calculateCost()
    {
        int ballCount = players / 3;
        yearlyCost += ballCount * ballCost;

        double stickTotal = stickCost * players;
        double skateTotal = skateCost * (2*players);
        yearlyCost += stickTotal + skateTotal;
    }

    public double getBatCost()
    {
        return stickCost;
    }

    public void setBatCost(double temp)
    {
        stickCost = temp;
    }

    public double getGloveCost()
    {
        return skateCost;
    }

    public void setGloveCost(double temp)
    {
        skateCost = temp;
    }
}
