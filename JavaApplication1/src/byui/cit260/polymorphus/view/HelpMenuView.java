/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class HelpMenuView extends View{

    public HelpMenuView() {
        super("\n"
                + "\n--------------------------------------------------"
                + "\n|  Help Menu                                       |"
                + "\n--------------------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nD - How to contact the Doctor"
                + "\nA - How to change armor and weapons"
                + "\nF - How to fight"
                + "\nT - Test the Array function"
                + "\nQ - Quit menu"
                + "\n--------------------------------------------------");
    }    
    
    @Override    
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                this.displayFightMenu();
                break;
            case 'T': // display inventory item array alphabetically
                this.displayArray();
                break;
            case 'Q': // quit the help menu
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        
        return false;
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

    private void displayFightMenu() {
        FightMenuView fightMenu = new FightMenuView();
        fightMenu.display();
    }

    private void displayArray() {
        
        String[] InventoryItems = {"Dragon Scale", "Orange Fruit", "WaterLily", "Gold Crown", "Diamond Necklace", 
            "Sword", "Staff", "Ring", "Apron", "Wand", "Pighead", "Book"};
        
        this.getSortedItems(InventoryItems);
        
        
    }
    
    private void getSortedItems(String[] items) {
            Arrays.sort(items);
            for(int i = 0; i < items.length; i++)
                System.out.println(items[i]);
        }
    
}
