/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import byui.cit260.polymorphus.control.ActionControl;
import java.util.Scanner;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class FightCharacterView extends View{
    
    public FightCharacterView() {
        super("\n"
                + "\n--------------------------------------------------"
                + "\n|  Fight Character Scene                          |"
                + "\n--------------------------------------------------"
                + "\nA - Attack the character"
                + "\nB - Block character's attack"
                + "\nP - Parry the character's attack"
                + "\nQ - Quit the fight"
                + "\n--------------------------------------------------");
    }    
    
    @Override    
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
    }

    private void fightCharacter() {
        int strength = 10;
        int weapon = 3;
        int armor = 5;
        int result = ActionControl.fightCharacter(strength, weapon, armor);
        System.out.println("\nYou hit the character with " + result + " strength.");
    }
    

    private void displayBlock() {
        System.out.println("\n*** Display blocking information ***");
    }

    private void displayParry() {
        System.out.println("\n*** Display parrying information ***");
    }
}
