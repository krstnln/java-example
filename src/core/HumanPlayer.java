/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import constants.Constants;

public class HumanPlayer extends Player 
{
    // constructor
    public HumanPlayer()
    {
        setScore(new ScoreCard());
    }

    // sends the dice to Die to be set 
    // to have random face values
    @Override
    public void rollDice(Roll dice)
    {
        for (Die die : dice.getDice())
        {
            die.rollDie();   
        }
    }
    
    @Override
    public void selectCategory(Roll selectedDice) 
    {
        int check = 0, cat = 0;
        
        System.out.println("Select a category for this roll:"); 
        selectedDice.displayDice();
        
        while (check == 0)
        {
            try
            {
                System.out.println("**************************");
                System.out.println("      UPPER  SECTION      ");
                System.out.println("**************************");
                System.out.println("1 - ONES");
                System.out.println("2 - TWOS");
                System.out.println("3 - THREES");
                System.out.println("4 - FOURS");
                System.out.println("5 - FIVES");
                System.out.println("6 - SIXES");
                System.out.println("**************************");
                System.out.println("      LOWER  SECTION      ");
                System.out.println("**************************");
                System.out.println("7 - THREE OF A KIND");
                System.out.println("8 - FOUR OF A KIND");
                System.out.println("9 - FULL HOUSE");
                System.out.println("10 - SMALL STRAIGHT");
                System.out.println("11 - LARGE STRAIGHT");
                System.out.println("12 - YAHTZEE");
                System.out.println("13 - CHANCE");
                System.out.println("**************************");

                Scanner scan = new Scanner(System.in);
                cat = scan.nextInt();
                check = 1;

                // verifies player entered a valid value
                if (cat > Constants.NUM_CATERGORY || cat <= 0)
                {
                    check = 0;
                    System.out.println("Invalid option, try again:");
                }
            }
            // verifies player entered an integer
            catch(InputMismatchException e)
            {
                System.out.println("Invalid option, try again:");
            }
        } 
	
        // sends valid category choice to be evaluated
        calculateScore(selectedDice, cat);
    }
    
    public void selectDice(Roll dice, Roll selectedDice, int rollNum)
    {
        
        int currValue = 0, choice = 0, i = 0;
        boolean check = false, finished = false;
        
        System.out.println("**************************");
        System.out.println("          ROLL " + rollNum + "          ");

        while (!finished)
        {
            while (check == false)
            {    
                try
                {
                    choice = 0;
                    
                    System.out.println("**************************");
                    System.out.println("Enter the index of the");
                    System.out.println("dice you want to keep."); 
                    System.out.println("Enter 0 when finished."); 
                    System.out.println("**************************");
                    dice.displayDice();
                    
                    Scanner scan = new Scanner(System.in);
                    choice = scan.nextInt();
                    
                    // verifies player entered a valid value
                    if (choice > dice.getDice().size() || choice < 0)
                    {
                        System.out.println("**************************");
                        System.out.println("Invalid option, try again:");
                    }
                    else
                    {
                        choice--;
                        check = true;
                    }
                }
                
                // verifies player entered an integer
                catch(InputMismatchException e)
                {
                    System.out.println("**************************");
                    System.out.println("Invalid option, try again:");
                }
            }
            
            // if player selected finished:
            if (choice == -1)
            {                
                if (rollNum == Constants.MAX_ROLLS)
                {
                    // if this is the third roll: transfers remaining 
                    // dice in original roll to the selectedDice roll
                    for (Die die : dice.getDice())
                    {
                        currValue = dice.getDice().get(i).getFaceValue();
                        die = new Die();
                        die.setFaceValue(currValue); 
                        selectedDice.getDice().add(die);                          
                        i++;
                    }
                    // clears out original roll
                    dice.removeDice(dice);
                }
                
                finished = true;
                break;
            }               
            else
            {
                System.out.println("**************************");
                System.out.println("Keep dice " + (choice + 1));
                    
                // if not final roll: gets the face value from the chosen die,
                // creates a new die for the selectedDice roll, and sets the 
                // new die to that value
                currValue = dice.getDice().get(choice).getFaceValue();
                Die die = new Die();
                die.setFaceValue(currValue); 
                selectedDice.getDice().add(die);  
                
                selectedDice.displayDice();
                    
                // removes the selected die from the original roll
                dice.getDice().remove(choice);
                
                check = false;   
            }
        }
    }
    
    public void calculateScore(Roll selectedDice, int cat)
    {
        System.out.println("Category " + cat + " selected.");
        
        // evaluates if the chosen category is in the upper or lower section
        if (cat <= Constants.SIXES)
           getScore().getUpper().evaluateCategory(selectedDice, cat);
        else
           getScore().getLower().evaluateCategory(selectedDice, cat);
        
        System.out.println("Total score: " + getScore().getGrandTotal());
    }
}