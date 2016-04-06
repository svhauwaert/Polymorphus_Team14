/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.control;

import Polymorphus.Polymorphus;
import byui.cit260.polymorphus.model.Game;
import byui.cit260.polymorphus.model.InventoryItem;
import byui.cit260.polymorphus.model.Item;
import byui.cit260.polymorphus.model.ItemBank;
//import byui.cit260.polymorphus.model.Map;
import byui.cit260.polymorphus.model.Player;
import exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Spencer Van Hauwaert
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game newGame = new Game(); // create new game
        Polymorphus.setCurrentGame(newGame); // save in Polymorphus
        
        newGame.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        newGame.setInventory(inventoryList);
        
        //Character character = new Character(); // create new characters
        //game.setCharacter(character); //
        
        //ItemBank itemBank = new ItemBank();
        //game.setItemBank(itemBank);
        
        //Map map = MapControl.createMap();
        //game.setMap(map);
        
        // move actors to starting position in the map
        //MapControl.moveActorsToStartingLocation(map);
    }

    public static InventoryItem[] createInventoryList() {
        
        // create array[list] of inventory items
        InventoryItem[] inventory =
            new InventoryItem[1];
        
        InventoryItem dragonScale = new InventoryItem();
        dragonScale.setDescription("Dragon Scale");
        dragonScale.setQuantityInStock(0);
        dragonScale.setRequiredAmount(0);
        inventory[Item.dragonscale.ordinal()] = dragonScale;
        
        InventoryItem knife = new InventoryItem();
        knife.setDescription("Knife");
        knife.setQuantityInStock(0);
        knife.setRequiredAmount(0);
        inventory[Item.knife.ordinal()] = knife;
                
        return inventory;
    }
    
    public static void saveGame(Game game, String filePath)
            throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath)
        throws GameControlException{
        Game game = null;
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream (fips);
            game = (Game) output.readObject();
            Polymorphus.setCurrentGame(game);
            //game.setInventory(inventoryList);
            }
        catch (FileNotFoundException fnfe){
            throw new GameControlException(fnfe.getMessage());
            }
        catch (Exception e){
             throw new GameControlException(e.getMessage());
        }
        
    }
    
}
