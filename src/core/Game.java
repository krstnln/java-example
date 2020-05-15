/*
 * Kristen Lane
 * COP 3330
 * Fall 2018
 */
package core;

import java.util.ArrayList;
import java.util.Scanner;
import constants.Constants;

public class Game 
{
    public int gameTurn;
    public ArrayList<Player> players;
    public Roll dice, selectedDice;
    
    // constructor
    public Game()
    {
        createPlayers();
        displayPlayers();
        playGame();
    }
    
    private void createPlayers()
    {
        // instantiates the players ArrayList
        players = new ArrayList<>();
        
        // scans in human player name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter human player name:"); 
        String name = scan.next();
 
        // instantiates human player
        HumanPlayer hplayer = new HumanPlayer();
        hplayer.setName(name);
        
        // instantiates ai player
        AiPlayer aplayer = new AiPlayer();
        aplayer.setName("AI Player");  
        
        // adds players to array list
        players.add(hplayer);
        players.add(aplayer);
    }
    
    private void displayPlayers()
    {
        System.out.println("**************************");
        System.out.println("Players for this game are:");
        
        // loops through players and displays information
        for (Player player : players)
        {
            System.out.println(player.getName());
        }
    }
    
    private void playGame()
    {
        int rollNum = 0;
        
        // instantiates the roll object to create
        // a set of dice storing random numbers
        dice = new Roll(); 
    
        // loops through each player for their turn
        for (Player player : players)
        {
            System.out.println("**************************");
            System.out.println("Player " + player.getName() + " has the dice.");
            
            // creates a new roll to store the dice the player chooses  
            // to keep, and clears out the randomly generated numbers
            selectedDice = new Roll();
            selectedDice.removeDice(selectedDice);
            
            System.out.println("Player " + player.getName() + " is rolling the dice.");

            // gives the player three rolls to choose dice to keep
            while (selectedDice.getDice().size() < Constants.NUM_DICE && rollNum < Constants.MAX_ROLLS)
            {
                player.rollDice(dice);
                rollNum++; 
                player.selectDice(dice, selectedDice, rollNum);         
            }

            // sends the player selected dice to select a category with
            System.out.println("**************************");
            player.selectCategory(selectedDice);
        }
    }

    public Roll getDice() 
    {
        return dice;
    }

    public void setDice(Roll dice) 
    {
        this.dice = dice;
    }

    public int getGameTurn() 
    {
        return gameTurn;
    }

    public void setGameTurn(int gameTurn) 
    {
        this.gameTurn = gameTurn;
    }

    public ArrayList<Player> getPlayers() 
    {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) 
    {
        this.players = players;
    }   
}
