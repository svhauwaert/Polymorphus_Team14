

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

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

import java.io.FileWriter;

/**
 *
 * @author Spencer Van Hauwaert
 * @author Spencer Walters
 */
public class Polymorphus implements Serializable{
    
    private static Game currentGame = null;
    private static Player player = null;
    //private static Player[] players;
    private static  PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static  PrintWriter logFile = null;

    
    //Demo for writing to the hard drive
    String charName;
    
    public void assignName (String c) {
        
        charName = c;
    }
    
    
    
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Polymorphus.logFile = logFile;
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
    
    
    
    public static void main (String[] args) {
            
        
        // writing a binary file
        try {
            
            FileOutputStream fileOut = new FileOutputStream("C://Users/Spencer/My Documents/BYUI/test.bin");
            // create output stream to hard drive
            
            ObjectOutputStream objOut = new ObjectOutputStream (fileOut);
            // prepare object to be written.            
            
            objOut.writeObject("Walt"); // Write the object and its value
            
            objOut.flush(); // flush content in streams
            
            objOut.close(); // close and release system resources from stream
            
        } catch (IOException ioe){
            
            System.out.println("An error occurred"); // if an error occurs
            
        }
        
        
        // Write out a text file
        
        try {
            
            String text = "Text inside the file";
            
            FileWriter fw = new FileWriter ("C://Users/Spencer/My Documents/BYUI/test.txt");
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            System.out.println("Failure");
        }
        
        
        try {
            Polymorphus.inFile = new BufferedReader(new InputStreamReader(System.in));
            Polymorphus.outFile = new PrintWriter(System.out, true);
            String filePath="C://Users/Spencer/My Documents/BYUI/log.txt";
            Polymorphus.logFile = new PrintWriter (filePath);
                
            StartProgramView startProgramView = new StartProgramView("");
            startProgramView.startProgram();
        }
        catch (IOException exe ){
            System.out.println(exe.getMessage());
                
        }
        catch (Throwable te ){
            System.out.println(te.getMessage());
            te.printStackTrace();
            //startProgramView.startProgram();
        }
            
        finally{
            Polymorphus.logFile.close();
            try {
                if(Polymorphus.inFile!=null)
                   Polymorphus.inFile.close();
                   if(Polymorphus.outFile!=null)
                       Polymorphus.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                   
                return;
            }
        }
    }
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Polymorphus.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Polymorphus.player = player;
    }

    private static class Writefile {

        public Writefile() {
        }

        private void assignName(String walt) {
            
        }
    }
    
    
}
