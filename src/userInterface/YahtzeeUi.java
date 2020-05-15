/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package userInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class YahtzeeUi 
{
    GameUi gameUi;
    PlayerUi playerUi;
    RollUi rollUi;
    ScoreCardUi scoreCardUi;
    JFrame frame;
    JMenuBar menuBar;
    JMenu game;
    JMenuItem exit;
    JMenuItem newGame;
    JPanel rightPanel;
    GridBagConstraints c;
    
    public YahtzeeUi()
    {
        initComponents();
    }
    
    private void initComponents()
    {
        // instantiate variables
        menuBar = new JMenuBar();
        game = new JMenu("Game");
        exit = new JMenuItem("Exit");
        newGame = new JMenuItem("New Game");
        scoreCardUi = new ScoreCardUi();
        rightPanel = new JPanel();
        gameUi = new GameUi();
        playerUi = new PlayerUi();
        rollUi = new RollUi();
        
        // initialize JFrame
        frame = new JFrame("Yahtzee!"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());  
        
        // set up right panel
        rightPanel.setLayout(new GridBagLayout());
        c =  new GridBagConstraints();
        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 10;
        rightPanel.add(gameUi, c);
        c.gridx = 0;
        c.gridy = 10;
        c.gridheight = 10;
        rightPanel.add(playerUi, c);
        c.gridx = 0;
        c.gridy = 20;
        c.gridheight = 10;
        rightPanel.add(rollUi, c);
        
        // add menu to frame
        game.add(newGame);
        game.add(exit);
        menuBar.add(game);
        frame.add(menuBar, BorderLayout.NORTH);

        // add scorecard panel to frame 
        scoreCardUi.setBorder(BorderFactory.createRaisedBevelBorder());
        frame.add(scoreCardUi, BorderLayout.WEST);
        scoreCardUi.setPreferredSize(new Dimension(550, 600));
        scoreCardUi.setMaximumSize(scoreCardUi.getPreferredSize()); 
        scoreCardUi.setMinimumSize(scoreCardUi.getPreferredSize());
        
        // add right panel to frame 
        rightPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        frame.add(rightPanel, BorderLayout.CENTER);  
        rightPanel.setPreferredSize(new Dimension(300, 600));
        rightPanel.setMaximumSize(rightPanel.getPreferredSize()); 
        rightPanel.setMinimumSize(rightPanel.getPreferredSize());
    
        frame.pack();
        frame.setVisible(true);
    }  
}
