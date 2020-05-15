/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package userInterface;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RollUi extends JPanel
{
    JButton d1, d2, d3, d4, d5, roll;
    
    public RollUi()
    {
        initComponents();       
    }
    
    private void initComponents()
    {
        d1 = new JButton("1");
        d2 = new JButton("2");
        d3 = new JButton("3");
        d4 = new JButton("4");
        d5 = new JButton("5");
        roll = new JButton("Roll Dice");
        
        // set up layout
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setPreferredSize(new Dimension(250, 400));
        this.setMaximumSize(this.getPreferredSize()); 
        this.setMinimumSize(this.getPreferredSize());
        
        // set button sizes
        d1.setPreferredSize(new Dimension(50, 50));
        d1.setMaximumSize(d1.getPreferredSize()); 
        d1.setMinimumSize(d1.getPreferredSize());
        d2.setPreferredSize(new Dimension(50, 50));
        d2.setMaximumSize(d2.getPreferredSize()); 
        d2.setMinimumSize(d2.getPreferredSize());
        d3.setPreferredSize(new Dimension(50, 50));
        d3.setMaximumSize(d3.getPreferredSize()); 
        d3.setMinimumSize(d3.getPreferredSize());
        d4.setPreferredSize(new Dimension(50, 50));
        d4.setMaximumSize(d4.getPreferredSize()); 
        d4.setMinimumSize(d4.getPreferredSize());
        d5.setPreferredSize(new Dimension(50, 50));
        d5.setMaximumSize(d5.getPreferredSize()); 
        d5.setMinimumSize(d5.getPreferredSize());
        roll.setPreferredSize(new Dimension(100, 100));
        roll.setMaximumSize(roll.getPreferredSize()); 
        roll.setMinimumSize(roll.getPreferredSize());
        
        // add buttons to panel
        this.add(d1);
        this.add(d2);
        this.add(d3);
        this.add(d4);
        this.add(d5);
        this.add(roll);
    }
}
   
