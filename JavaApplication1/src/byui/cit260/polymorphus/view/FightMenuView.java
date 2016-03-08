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
public class FightMenuView extends View{

    public FightMenuView() {
        super("\n"
                + "\n--------------------------------------------------"
                + "\n|  Fight Menu                                      |"
                + "\n--------------------------------------------------"
                + "\nH - How do you fight a character?"
                + "\nS - How do you sharpen a weapon?"
                + "\nD - When do you know you or your opponent are dead?"
                + "\nB - How do you block orparry in a fight?"
                + "\nW - How do you know you won the fight?"
                + "\nQ - Quit fight menu"
                + "\n--------------------------------------------------");
    }
    
        
    
    @Override    
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
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
