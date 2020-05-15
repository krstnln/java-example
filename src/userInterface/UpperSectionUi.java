/**
 *
 * @author Kristen
 */
package userInterface;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpperSectionUi extends JPanel
{
    JLabel round;
    JButton b1, b2, b3, b4, b5, b6;
    JLabel total;
    JLabel bonus;
    JLabel totalScore;
    GridBagConstraints c;
    
    public UpperSectionUi()
    {
        initComponents();       
    }
    
    private void initComponents()
    {
        round = new JLabel();
        b1 = new JButton("Aces         Count and add only Aces");
        b2 = new JButton("Twos         Count and add only Twos");
        b3 = new JButton("Threes         Count and add only Threes");
        b4 = new JButton("Fours         Count and add only Fours");
        b5 = new JButton("Fives         Count and add only Fives");
        b6 = new JButton("Sixes         Count and add only Sixes");
        totalScore = new JLabel("TOTAL SCORE");
        bonus = new JLabel("BONUS      if score is 63 or over");
        total = new JLabel("TOTAL of Upper Section");
        
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
        c.gridwidth = 1;
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
        // add other labels
        c.gridx = 0;
        c.gridy = 8;
        c.gridheight = 1;
        c.gridwidth = 4;
        this.add(total, c);
        c.gridx = 0;
        c.gridy = 7;
        c.gridheight = 1;
        this.add(bonus, c);
        c.gridx = 0;
        c.gridy = 6;
        c.gridheight = 1;
        this.add(totalScore, c);
    }   
}

