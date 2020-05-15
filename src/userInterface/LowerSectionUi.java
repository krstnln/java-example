/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package userInterface;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LowerSectionUi extends JPanel
{
    JLabel round;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JLabel totalLower;
    JLabel totalUpper;
    JLabel grandTotal; 
    GridBagConstraints c;    
    
    public LowerSectionUi()
    {
        initComponents();       
    }
    
    private void initComponents()
    {
        round = new JLabel();
        b1 = new JButton("3 of a Kind         Add total of all dice");
        b2 = new JButton("4 of a Kind         Add total of all dice");
        b3 = new JButton("Full House         Score 25");
        b4 = new JButton("Small Straight         Score 30");
        b5 = new JButton("Large Straight          Score 40");
        b6 = new JButton("YAHTZEE         Score 50");
        b7 = new JButton("Chance         Add total of all dice");
        b8 = new JButton("YAHTZEE BONUS         Score 100");
        totalLower = new JLabel("TOTAL of Lower Section");
        totalUpper = new JLabel("TOTAL of Upper Section");
        grandTotal = new JLabel("GRAND TOTAL");
        
        // set up layout
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        
        // add buttons and labels to panel
        c =  new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;       
        // add button 1
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        this.add(b1, c);
        // add button 2
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        this.add(b2, c);
        // add button 3
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 1;
        this.add(b3, c);
        // add button 4
        c.gridx = 0;
        c.gridy = 3;
        c.gridheight = 1;
        this.add(b4, c);
        // add button 5
        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 1;
        this.add(b5, c);
        // add button 6
        c.gridx = 0;
        c.gridy = 5;
        c.gridheight = 1;
        this.add(b6, c);
        // add button 7
        c.gridx = 0;
        c.gridy = 6;
        c.gridheight = 1;
        this.add(b7, c);
        // add button 8
        c.gridx = 0;
        c.gridy = 7;
        c.gridheight = 1;
        this.add(b8, c);
        // add other labels
        c.gridx = 0;
        c.gridy = 8;
        c.gridheight = 1;
        this.add(totalLower, c);
        c.gridx = 0;
        c.gridy = 9;
        c.gridheight = 1;
        this.add(totalUpper, c);
        c.gridx = 0;
        c.gridy = 10;
        c.gridheight = 1;
        this.add(grandTotal, c);    
    } 
}
