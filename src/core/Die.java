/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

import java.util.ArrayList;
import java.util.Random;
import constants.Constants;

public class Die 
{
    public int faceValue;
    
    // sets each die in dice to a random number between 1 and 6
    public void rollDie()
    {
        Random random = new Random();
        setFaceValue(random.nextInt(Constants.MAX_DIE_VALUE) + 1);
    }
    
    public int getFaceValue() 
    {
        return faceValue;
    }

    public void setFaceValue(int faceValue) 
    {
        this.faceValue = faceValue;
    } 
}