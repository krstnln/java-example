/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

import constants.Constants;
import java.util.ArrayList;

public class Roll 
{
    //container for the five dice
    public ArrayList<Die> dice;
    
    // constructor
    public Roll()
    {
        createDice();
    }
   
    // getter/setter
    public ArrayList<Die> getDice() 
    {
        return dice;
    }

    public void setDice(ArrayList<Die> dice) 
    {
        this.dice = dice;
    }
    
    public void createDice() 
    {
        dice = new ArrayList<Die>();

        for (int d = 0; d < Constants.NUM_DICE; d++)
        {
           Die die = new Die();
           dice.add(die);           
        }
    }
    
    public void displayDice()
    {
        int i = 1;
        System.out.println("Dice values:");
        for (Die die : dice)
        {
            System.out.println("Die " + i + " - " + die.getFaceValue());
            i++;
        }
    }

    public void removeDice(Roll dice) 
    {
        this.dice.clear();  
    }
}
