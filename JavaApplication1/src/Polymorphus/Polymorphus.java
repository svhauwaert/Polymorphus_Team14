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


/**
 *
 * @author Spencer
 * @author Spencer Walters
 */
public class Polymorphus {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
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
    
}
