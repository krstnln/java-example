/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package userInterface;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreCardUi extends JPanel
{
    JLabel grandTotal;
    LowerSectionUi lowerUi;
    UpperSectionUi upperUi;
    GridBagConstraints c;
    
    public ScoreCardUi()
    {
        initComponents();       
    }
    
    private void initComponents()
    {       
        lowerUi = new LowerSectionUi();
        upperUi = new UpperSectionUi();
        
        // set up layout
        this.setLayout(new GridBagLayout());
        
        // add sections to panel
        c =  new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 4;
        this.add(upperUi, c);
        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 4;
        this.add(lowerUi, c);
    }
}
