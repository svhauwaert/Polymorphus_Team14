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


/**
 *
 * @author Spencer
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        Polymorphus.setCurrentGame(game); // save in Polymorphus
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
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
        
        InventoryItem key = new InventoryItem();
        key.setDescription("Key");
        key.setQuantityInStock(0);
        key.setRequiredAmount(0);
        inventory[Item.key.ordinal()] = key;
        
        InventoryItem torch = new InventoryItem();
        torch.setDescription("Torch");
        torch.setQuantityInStock(0);
        torch.setRequiredAmount(0);
        inventory[Item.torch.ordinal()] = torch;
                
        return inventory;
    }
    
}
