/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package userInterface;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerUi extends JPanel
{
    JLabel playerName;
    JLabel playerScore;
    GridBagConstraints c;
    
    public PlayerUi()
    {
        initComponents();       
    }
    
    private void initComponents()
    {
        playerName = new JLabel("Name                 0");
        playerScore = new JLabel();

        // set up layout
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setPreferredSize(new Dimension(250, 100));
        this.setMaximumSize(this.getPreferredSize()); 
        this.setMinimumSize(this.getPreferredSize());
        
        // add labels to panel
        c =  new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 4;
        this.add(playerName, c);
        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 4;
        this.add(playerScore, c);
    } 
}
