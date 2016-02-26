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
public class FightMenuView {

    private final String MENU = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Fight Menu                                      |"
                + "\n--------------------------------------------------"
                + "\nH - How do you fight a character?"
                + "\nS - How do you sharpen a weapon?"
                + "\nD - When do you know you or your opponent are dead?"
                + "\nB - How do you block orparry in a fight?"
                + "\nW- How do you know you won the fight?"
                + "\nQ - Quit fight menu"
                + "\n--------------------------------------------------";
        
    public void displayFightMenu() {
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
            case 'H': // display how to fight character
                this.displayFightInfo();
                break;
            case 'S': // display how to sharpen weapon
                this.displayFixWeapon();
                break;
            case 'D': // display how you know you/opponent died
                this.displayDeadInfo();
                break;
            case 'B': // display how to block or parry in fight
                this.displayBlockInfo();
                break;
            case 'W': // display when you won fight
                this.displayWinInfo();
                break;
            case 'Q': // quit the fight menu
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }

    private void displayFightInfo() {
        System.out.println("*** displayFightInfo function ***");
    }

    private void displayFixWeapon() {
        System.out.println("*** displayFixWeapon function ***");
    }

    private void displayDeadInfo() {
        System.out.println("*** displayDeadInfo function ***");
    }

    private void displayBlockInfo() {
        System.out.println("*** displayBlockInfo function ***");
    }

    private void displayWinInfo() {
        System.out.println("*** displayWinInfo function ***");
    }
    
}
