package com.company;
import java.util.*;

public class Sport
{
    private double yearlyCost;

    private int players;
    private String ballType;
    private double ballCost;
    private double yearlyBudget;

    public Sport()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        players = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the type of ball: ");
        ballType = scan.nextLine();
        System.out.println("Enter the cost per ball: ");
        ballCost = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the yearly budget: ");
        yearlyBudget = Double.parseDouble(scan.nextLine());
        this.calculateCost();
    }

    public void calculateCost()
    {
        int ballCount = players / 3;
        yearlyCost = ballCount * ballCost;
    }
    
    
    public int getPlayers()
    {
        return players;
    }

    public void setPlayers(int temp)
    {
        players = temp;
    }

    public String getBallType()
    {
        return ballType;
    }

    public void setBallType(String temp)
    {
        ballType = temp;
    }

    public double getBallCost()
    {
        return ballCost;
    }

    public void setBallCost(double temp)
    {
        ballCost = temp;
    }
    
    public double getYearlyBudget()
    {
        return yearlyBudget;
    }

    public void setYearlyBudget(double temp)
    {
        yearlyBudget = temp;
    }

    public String toString()
    {
        return "Number of players: " + players + "\nType of ball: " + ballType + "\nCost Per ball: " + ballCost + "\nYearly budget: " + yearlyBudget + "\nCost per year: " + yearlyCost;
    }
}
