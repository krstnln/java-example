/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

import constants.Constants;

public class UpperSection 
{
    private int aces; 
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;
    private int totalScore;
    private int bonus;
    private int total;

    public int getAces() 
    {
        return aces;
    }

    public void setAces(int aces) 
    {
        this.aces += aces;
    }

    public int getTwos() 
    {
        return twos;
    }

    public void setTwos(int twos) 
    {
        this.twos += twos;
    }

    public int getThrees() 
    {
        return threes;
    }

    public void setThrees(int threes) 
    {
        this.threes += threes;
    }

    public int getFours() 
    {
        return fours;
    }

    public void setFours(int fours) 
    {
        this.fours += fours;
    }

    public int getFives() 
    {
        return fives;
    }

    public void setFives(int fives) 
    {
        this.fives += fives;
    }

    public int getSixes() 
    {
        return sixes;
    }

    public void setSixes(int sixes) 
    {
        this.sixes += sixes;
    }

    public int getTotalScore() 
    {
        totalScore = aces + twos + threes + fours + fives + sixes;
        return totalScore;
    }

    public void setTotalScore(int totalScore) 
    {
        this.totalScore = totalScore;
    }

    public int getBonus() 
    {
        return bonus;
    }

    public void setBonus(int bonus) 
    {
        this.bonus = bonus;
    }

    public int getTotal() 
    {
        return getTotalScore() + getBonus();
    }

    public void setTotal(int total) 
    {
        this.total = total;
    }
    
    public void evaluateCategory(Roll selectedDice, int cat)
    {
        // each category evaluates whether or not the selectedDice satisfy
        // the rules of the game. if they do, the appropriate score is set.
        // if not, the category is scored with a zero.
        switch (cat)
        {
            case 1:
                for (Die die : selectedDice.getDice())
                    if (die.getFaceValue() == Constants.ONES)
                        setAces(Constants.ONES);
                break;
            case 2:
                for (Die die : selectedDice.getDice())
                    if (die.getFaceValue() == Constants.TWOS)
                        setTwos(Constants.TWOS);
                break;
            case 3:
                for (Die die : selectedDice.getDice())
                    if (die.getFaceValue() == Constants.THREES)
                        setThrees(Constants.THREES);
                break;
            case 4:
                for (Die die : selectedDice.getDice())
                    if (die.getFaceValue() == Constants.FOURS)
                        setFours(Constants.FOURS);
                break;
            case 5:
                for (Die die : selectedDice.getDice())
                    if (die.getFaceValue() == Constants.FIVES)
                        setFives(Constants.FIVES);
                break;
            case 6:
                for (Die die : selectedDice.getDice())
                    if (die.getFaceValue() == Constants.SIXES)
                        setSixes(Constants.SIXES);
                break;
        }
    }
}
