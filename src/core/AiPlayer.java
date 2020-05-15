/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

public class AiPlayer extends Player
{
    @Override
    public void rollDice(Roll dice) 
    {
        for (Die die:dice.getDice())
        {
            die.rollDie();
        }
    }
    
    @Override
    public void selectCategory(Roll selectedDice) 
    {
    }             

    @Override
    public void selectDice(Roll dice, Roll selectedDice, int rollNum) 
    {
    }

    @Override
    public void calculateScore(Roll selectedDice, int cat) 
    {
    }
}
    