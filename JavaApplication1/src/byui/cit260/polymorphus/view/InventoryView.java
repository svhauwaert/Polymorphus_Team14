/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import byui.cit260.polymorphus.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author swalters
 */
/*public class InventoryView {
    
      private final String MENU = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Inventory View                                |"
                + "\n--------------------------------------------------"
                + "\nI - Display Inventory of character"
                + "\nD - Drop Item"
                + "\nU - Use Item"
                + "\nQ - Back to game menu"
                + "\n--------------------------------------------------";
        
    public void displayInventory() {
            char selection = ' ';
            do {
                
                System.out.println(MENU); // display the Inventory Items
                
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
            System.out.println("View Inventory choice:");
            
            // get the option from the keyboard and trim off the blanks
            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();
            
            // if the option is invalid
            if (playersInput == " ") {
                System.out.println("Invalid Inventory choice - Please choose from the above options");
                continue; // and repeat again
            }
            break; // out of the (exit) repetition
        }
        
        return playersInput; // return the name
    }
        
    public void doAction(char choice){
        
        switch (choice) {
            case 'I': // display results of Inventory
                this.inventoryView();
                break;
            case 'D': // drop item
                this.displaydrop();
                break;
            case 'U': // use item
                this.displayParry();
                break;
            case 'Q': // quit the inventory
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }

    private void inventoryView() {
        int InvenroyItem = 10;
        int itemBank = 3;
        int description = 5;
         System.out.println("\nYou hit the character with " + result + " strength.");
    }
    

    private void displayDrop() {
        System.out.println("\n*** Display blocking information ***");
    }

    private void displayUse() {
        System.out.println("\n*** Display parrying information ***");
    }
} */
