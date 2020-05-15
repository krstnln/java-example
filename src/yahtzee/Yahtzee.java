/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package yahtzee;

import core.Game;
import javax.swing.JOptionPane;
import userInterface.YahtzeeUi;

public class Yahtzee {
    
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Yahtzee!");   
        JOptionPane.showMessageDialog(null, "Let's Play Yahtzee!");  
        
        YahtzeeUi yahtzeeUi = new YahtzeeUi();
        Game game = new Game();
    }
}
