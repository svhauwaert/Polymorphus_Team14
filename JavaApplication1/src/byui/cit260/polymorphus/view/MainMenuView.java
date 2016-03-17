/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import Polymorphus.Polymorphus;
import byui.cit260.polymorphus.control.GameControl;
import java.util.Scanner;

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
            + "\nG - Start game"
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

    private void startExsistingGame() {
        System.out.println("*** displayMoveGame function ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayDoctorGame function ***");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("*** displayArmorGame function ***");
    }
    
}