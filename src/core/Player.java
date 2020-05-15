/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

public abstract class Player implements IPlayer 
{    
    private String name;
    private ScoreCard score;
    private static int count;
    
    public abstract void selectDice(Roll dice, Roll selectedDice, int rollNum);
    public abstract void calculateScore(Roll selectedDice, int cat);
 
    public Player()
    {
        count++;
    }
       
    public static int getCount()
    {
        return count;
    }
        
    public ScoreCard getScore() 
    {
        return score;
    }

    public void setScore(ScoreCard score) 
    {
        this.score = score;
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
}
