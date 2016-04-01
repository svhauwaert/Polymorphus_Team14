
package byui.cit260.polymorphus.view;

import Polymorphus.Polymorphus;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Spencer Van Hauwaert
 * 
 * View Super class
 */

public abstract class View implements ViewInterface {
    
    private String message;
    
    protected final BufferedReader keyboard = Polymorphus.getInFile();
    protected final PrintWriter console = Polymorphus.getOutFile();
    
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {  //display fight scene from FightCharacterView.java
            String value = "";
            boolean done = false;
            do {
                this.console.println(this.message);
                //System.out.println(this.displayMessage); // display the fight scenerio
                value = this.getInput(); // get the user's selection
                done = this.doAction(value); // do action based on selection
        }
        while (!done); // a selection that is not "Quit"
    }
    
    public String getInput(){
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        try{
            while (!valid) { // while a value has not been entered

                // get the value entered from the keyboard
                selection = this.keyboard.readLine();
                selection = selection.trim();

                if (selection.length() < 1) { // blank value entered
                    System.out.println("\n*** Invalid selection *** Try again");
                    continue;
                }

                break;
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return selection; // return the name
    }
    
}
