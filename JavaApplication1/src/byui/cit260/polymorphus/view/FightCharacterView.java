/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import java.util.Scanner;

/**
 *
 * @author Spencer
 */
public class FightCharacterView {
    
    private final String MENU = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Fight Character Scene                                      |"
                + "\n--------------------------------------------------"
                + "\nA - Attack the character"
                + "\nB - Block character's attack"
                + "\nP - Parry the character's attack"
                + "\nQ - Quit the fight"
                + "\n--------------------------------------------------";
        
    public void displayFightScene() {
            char selection = ' ';
            do {
                
                System.out.println(MENU); // display the fight scenerio
                
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
            
            // prompt for the player's fight choice
            System.out.println("Enter a fight selection:");
            
            // get the option from the keyboard and trim off the blanks
            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();
            
            // if the option is invalid
            if (playersInput == " ") {
                System.out.println("Invalid fight choice - Please choose from the above options");
                continue; // and repeat again
            }
            break; // out of the (exit) repetition
        }
        
        return playersInput; // return the name
    }
        
    public void doAction(char choice){
        
        switch (choice) {
            case 'A': // display results from fight round
                this.fightCharacter();
                break;
            case 'B': // display results from blocking
                this.displayBlock();
                break;
            case 'P': // display results from parrying
                this.displayParry();
                break;
            case 'Q': // quit the fight
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }

    private void fightCharacter() {
        System.out.println("\n*** This is were the fight function is called ***");
    }

    private void displayBlock() {
        System.out.println("\n*** Display blocking information ***");
    }

    private void displayParry() {
        System.out.println("\n*** Display parrying information ***");
    }
}
