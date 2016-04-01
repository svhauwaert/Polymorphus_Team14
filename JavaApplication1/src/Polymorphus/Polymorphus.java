/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphus;

import byui.cit260.polymorphus.model.Game;
import byui.cit260.polymorphus.model.Player;
import byui.cit260.polymorphus.model.InventoryItem;
import byui.cit260.polymorphus.model.Map;
import byui.cit260.polymorphus.model.ItemBank;
import byui.cit260.polymorphus.model.Weapons;
import byui.cit260.polymorphus.model.Armor;
import byui.cit260.polymorphus.model.CastleLevel;
import byui.cit260.polymorphus.model.CastleRoom;
import byui.cit260.polymorphus.model.Doctor;
import byui.cit260.polymorphus.model.PlayerAction;
import byui.cit260.polymorphus.model.Potion;
import byui.cit260.polymorphus.model.SceneType;
import byui.cit260.polymorphus.model.Character;
import byui.cit260.polymorphus.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Spencer Van Hauwaert
 * @author Spencer Walters
 */
public class Polymorphus {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Polymorphus.logFile = logFile;
    }

    
    public static void main(String[] args) {
        
        try{
            
            //open the character stream files for the end user input and output
            //Polymorphus.inFile =
            //        new BufferedReader(new InputStreamReader(System.in));
            
            Polymorphus.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            Polymorphus.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView("");
            startProgramView.display();
            return;
        
        } catch (Throwable e){
            
            System.out.println("exception: " + e.toString() +
                                "\nCause:" + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                if (Polymorphus.inFile != null)
                    Polymorphus.inFile.close();
                
                if (Polymorphus.outFile != null)
                    Polymorphus.outFile.close();
                
                if (Polymorphus.logFile != null)
                    Polymorphus.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentgame) {
        Polymorphus.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }

    public static void setPlayer(Player player) {
        Polymorphus.player = player;
    }

    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Polymorphus.outFile = outFile;
    }
    
    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Polymorphus.inFile = inFile;
    }
    
}
