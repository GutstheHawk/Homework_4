package com.company;
import java.util.*;

public class Sport
{
    protected double yearlyCost;

    protected int players;
    protected String ballType;
    protected double ballCost;
    protected double yearlyBudget;

    public Sport()
    {
        ballType = "None";
    }

    public Sport(int players, double ballCost, double yearlyBudget)
    {
        ballType = "None";
        players = this.players;
        ballCost = this.ballCost;
        yearlyBudget = this.yearlyBudget;
    }
    public void userPrompt()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        players = Integer.parseInt(scan.nextLine());
        //System.out.println("Enter the type of ball: ");
        //ballType = scan.nextLine();
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

    public void budgetCheck()
    {
        if (yearlyBudget >= yearlyCost)
        {
            System.out.println("Yay! We can afford this years equipment!");
        }
        else
        {
            System.out.println("Oh no! We dont have enough money this year!");
        }
    }
    
    
    public int getPlayers() { return players; }

    public void setPlayers(int temp) { players = temp; }

    public String getBallType() { return ballType; }

    public void setBallType(String temp) { ballType = temp; }

    public double getBallCost() { return ballCost; }

    public void setBallCost(double temp) { ballCost = temp; }
    
    public double getYearlyBudget() { return yearlyBudget; }

    public void setYearlyBudget(double temp) { yearlyBudget = temp; }

    public String toString()
    {
        return "Number of players: " + players + "\nType of ball: " + ballType + "\nCost Per ball: $" + ballCost + "\nYearly budget: $" + yearlyBudget + "\nCost per year: $" + yearlyCost;
    }
}
