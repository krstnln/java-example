/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

public class ScoreCard 
{
    private UpperSection upper;
    private LowerSection lower;
    private int grandTotal;
    
    // constructor
    public ScoreCard()
    {
        upper = new UpperSection();
        lower = new LowerSection();
    }

    public UpperSection getUpper() 
    {
        return upper;
    }

    public void setUpper(UpperSection upper) 
    {
        this.upper = upper;
    }

    public LowerSection getLower() 
    {
        return lower;
    }

    public void setLower(LowerSection lower) 
    {
        this.lower = lower;
    }

    public int getGrandTotal() 
    {
        return grandTotal += getUpper().getTotal() + getLower().getTotalScore();
    }

    public void setGrandTotal(int grandTotal)
    {
        this.grandTotal = grandTotal;
    }
}
