/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import constants.Constants;

public class LowerSection 
{
    private int threeKind;
    private int fourKind;
    private int fullHouse;
    private int smStraight;
    private int lgStraight;
    private int yahtzee;
    private int chance;
    private int yahtzeeBonus;
    private int totalScore;

    public int getThreeKind() 
    {
        return threeKind;
    }

    public void setThreeKind(int threeKind) 
    {
        this.threeKind += threeKind;
    }

    public int getFourKind() 
    {
        return fourKind;
    }

    public void setFourKind(int fourKind) 
    {
        this.fourKind += fourKind;
    }

    public int getFullHouse() 
    {
        return fullHouse;
    }

    public void setFullHouse(int fullHouse) 
    {
        this.fullHouse = fullHouse;
    }

    public int getSmStraight() 
    {
        return smStraight;
    }

    public void setSmStraight(int smStraight) 
    {
        this.smStraight = smStraight;
    }

    public int getLgStraight() 
    {
        return lgStraight;
    }

    public void setLgStraight(int lgStraight) 
    {
        this.lgStraight = lgStraight;
    }

    public int getYahtzee() 
    {
        return yahtzee;
    }

    public void setYahtzee(int yahtzee) 
    {
        this.yahtzee = yahtzee;
    }

    public int getChance() 
    {
        return chance;
    }

    public void setChance(int chance) 
    {
        this.chance += chance;
    }

    public int getYahtzeeBonus() 
    {
        return yahtzeeBonus;
    }

    public void setYahtzeeBonus(int yahtzeeBonus) 
    {
        this.yahtzeeBonus = yahtzeeBonus;
    }

    public int getTotalScore() 
    {
        totalScore = threeKind + fourKind + fullHouse + smStraight 
             + lgStraight + yahtzee + chance + yahtzeeBonus;
        return totalScore;
    }

    public void setTotalScore(int totalScore) 
    {
        this.totalScore = totalScore;
    }
    
    private ArrayList<Integer> sortDice(Roll selectedDice)
    {
        int i;
        ArrayList<Integer> IntList = new ArrayList<Integer>();
        
        // converts all dice into a sorted ArrayList of Integers     
        for (i = 0; i < selectedDice.dice.size(); i++)
        {
            Integer currInt = selectedDice.dice.get(i).getFaceValue();
            IntList.add(currInt);
        }

        Collections.sort(IntList);
        return IntList;
    }
    
    public void evaluateCategory(Roll selectedDice, int cat)
    {
        int i, j, count = 0;
        
        // sort dice
        ArrayList sorted = sortDice(selectedDice);
        
        // each category evaluates whether or not the selectedDice satisfy
        // the rules of the game. if they do, the appropriate score is set.
        // if not, the category is scored with a zero.
        switch (cat)
        {
            case 7:
                System.out.println("Three of a Kind");
                
                for (i = 0; i < sorted.size(); i++)
                {
                    for (j = i + 1; j < sorted.size(); j++)
                    {
                        if (sorted.get(i) == sorted.get(j))
                            count++;
                    }                   
                    
                    if (count >= 3)
                    {
                        for (Die die : selectedDice.getDice())
                            setThreeKind(die.getFaceValue());
                        break;
                    }
                    else
                    {
                        setThreeKind(Constants.ZERO);
                    }
                }
                break; 
            case 8:
                System.out.println("Four of a Kind");
                
                for (i = 0; i < sorted.size(); i++)
                {
                    for (j = i + 1; j < sorted.size(); j++)
                    {
                        if (sorted.get(i) == sorted.get(j))
                            count++;
                    }
                    
                    if (count >= 6)
                    {
                        for (Die die : selectedDice.getDice())
                            setFourKind(die.getFaceValue());
                    }
                    else
                    {
                        setFourKind(Constants.ZERO);
                    }
                }
                break;               
            case 9:
                System.out.println("Full House");
                
                for (i = 0; i < sorted.size(); i++)
                {
                    for (j = i + 1; j < sorted.size(); j++)
                    {
                        if (sorted.get(i) == sorted.get(j))
                            count++;
                    }
                    
                    if (count == 4)
                    {
                        for (Die die : selectedDice.getDice())
                            setFullHouse(die.getFaceValue());
                    }
                    else
                    {
                        setFullHouse(Constants.ZERO);
                    }
                }
                break;
            case 10:
                System.out.println("Small Straight");
                
                for (i = 0, j = 1; j < sorted.size(); i++, j++)                    
                    if ((Integer)sorted.get(j) == ((Integer)sorted.get(i) + 1))
                        count++;               

                if (count >= 3)
                {
                    setSmStraight(Constants.SM_STRAIGHT);
                }
                else
                {
                    setSmStraight(Constants.ZERO);
                }                
                break;
            case 11:
                System.out.println("Large Straight");
                
                for (i = 0, j = 1; j < sorted.size(); i++, j++)                    
                    if ((Integer)sorted.get(j) == ((Integer)sorted.get(i) + 1))
                        count++;               

                if (count >= 4)
                {
                    setLgStraight(Constants.LG_STRAIGHT);
                }
                else
                {
                    setLgStraight(Constants.ZERO);
                } 
                break;
            case 12:
                System.out.println("Yahtzee");
                
                for (i = 0, j = 1; j < sorted.size(); j++)                    
                    if ((Integer)sorted.get(i) == ((Integer)sorted.get(j)))
                        count++;      

                if (count == 4)
                {
                    // need to account for Yahtzee bonus
                    setYahtzee(Constants.YAHTZEE);
                }
                else
                {
                    setYahtzee(Constants.ZERO);
                } 
                break;
            case 13:
                System.out.println("Chance");
                
                for (Die die : selectedDice.getDice())
                    setChance(die.getFaceValue());
                break;
        }
    }
}