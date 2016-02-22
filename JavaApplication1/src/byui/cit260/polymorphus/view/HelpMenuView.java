/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import java.util.Scanner;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class HelpMenuView {

    private final String MENU = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Help Menu                                       |"
                + "\n--------------------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nD - How to contact the Doctor"
                + "\nA - How to change armor and weapons"
                + "\nF - How to fight"
                + "\nQ - Quit menu"
                + "\n--------------------------------------------------";
        
    public void displayHelpMenu() {
            char selection = ' ';
            do {
                
                System.out.println(MENU); // display the help menu
                
                String input = this.getInput(); // get the user's selection
                selection = input.charAt(0); // get first character of string
                
                this.doAction(selection); // do action based on selection
                
        } while (selection != 'Q'); // a selection that is not "Quit"
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
            case 'G': // display game goal information
                this.displayGameGoal();
                break;
            case 'M': // display how to move around
                this.displayMoveGame();
                break;
            case 'D': // display how to call the doctor
                this.displayDoctorGame();
                break;
            case 'A': // display how to change armor or weapons
                this.displayArmorGame();
                break;
            case 'F': // display how to fight
                this.displayFightGame();
                break;
            case 'Q': // quit the help menu
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }    

    private void displayGameGoal() {
        System.out.println("*** displayGameGoal function ***");
    }

    private void displayMoveGame() {
        System.out.println("*** displayMoveGame function ***");
    }

    private void displayDoctorGame() {
        System.out.println("*** displayDoctorGame function ***");
    }

    private void displayArmorGame() {
        System.out.println("*** displayArmorGame function ***");
    }

    private void displayFightGame() {
        System.out.println("*** displayFightGame function ***");
    }
    
}
