/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import java.util.Scanner;

/**
 *
 * @author swalters
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n*---------------------------------------------------------------"
            + "\n* | Main Menu                                                  |"
            + "\n*---------------------------------------------------------------" 
            + "\nN - Start new game"
            + "\nG - Start game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit";
    
    public void displayMenu(){
        char selection = ' ';
        do {
            
            System.out.println(MENU);  // display the main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        
        } while (selection != 'E'); //an selection is not "Exit"

    }
 }

     
    
    private String getInput() {
        boolean valid = false; // indicates if the option has be retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid option has not been retrieved
            
            // prompt for the player's menu choice
            System.out.println("Enter a menu selection:");
            
            // get the option from the keyboard and trim off the blanks
            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();
            
            // if the option is invalid
            if (playersInput == " ") {
                System.out.println("Invalid menu choice - Please choose from the above options");
                continue; // and repeat again
            }
            break; // out of the (exit) repetition
        }
        
        return playersInput; // return the name
    }

        public void doAction(char choice){
        
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
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 
    private void startNewGame() {
        System.out.println("*** displayGameGoal function ***");
    }

    private void startExsistingGame() {
        System.out.println("*** displayMoveGame function ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayDoctorGame function ***");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
        System.out.println("*** displayArmorGame function ***");
    }
    
   
}
