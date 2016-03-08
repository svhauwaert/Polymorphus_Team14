
package byui.cit260.polymorphus.view;

import java.util.Scanner;

/**
 *
 * @author Spencer Van Hauwaert
 * 
 * View Super class
 */

public abstract class View implements ViewInterface {
    
    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {  //display fight scene from FightCharacterView.java
            String value = "";
            boolean done = false;
            do {
                System.out.println(this.displayMessage); // display the fight scenerio
                value = this.getInput(); // get the user's selection
                done = this.doAction(value); // do action based on selection
        }
        while (!done); // a selection that is not "Quit"
    }
    
    public String getInput(){
        boolean valid = false;
        String selection = null;
        
        while (!valid) { // while a value has not been entered
            // get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) { // blank value entered
                System.out.println("You must enter a value.");
                continue;
            }
            
            break;
        }
        
        return selection; // return the name
    }
    
}
