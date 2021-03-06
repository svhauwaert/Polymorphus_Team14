/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import Polymorphus.Polymorphus;
import byui.cit260.polymorphus.control.GameControl;
import byui.cit260.polymorphus.model.Game;
import exceptions.GameControlException;
import java.util.Scanner;
import java.io.Console;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author swalters
 * 
 * Modified by Spencer Van Hauwaert
 * Added New game function -> Spencer Van Hauwaert
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            + "\n*---------------------------------------------------------------"
            + "\n* | Main Menu                                                  |"
            + "\n*---------------------------------------------------------------" 
            + "\nN - Start new game"
            + "\nG - Start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit");
    }
    
    
    
        @Override
        public boolean doAction(Object obj) {
            
            String value = (String) obj;
            value = value.toUpperCase();
            char choice = value.charAt(0);
                    
            switch (choice) {
                case 'N': // Start new Game
                    this.startNewGame();
                    break;
                case 'G': // get and start an existing game
                    this.startExsistingGame();
                    break;
                case 'H': // display help menu
                    this.displayHelpMenu();
                    break;
                case 'S': // save currant game
                    this.saveGame();
                    break;
                case 'E': // Exit the game
                    return true;
                default:
                    System.out.println("\n*** Invalid Selection *** Try again");
                    break;
            }
            return false;
        }
        
        
    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(Polymorphus.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExsistingGame() {// Added by Spencer Van Hauwaert
                        this.console.println("\nEnter the file path for file where the game is to be saved");
        String filePath = this.getInput();
        try {
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game"
                            + " is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file path
            GameControl.saveGame(Polymorphus.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
}