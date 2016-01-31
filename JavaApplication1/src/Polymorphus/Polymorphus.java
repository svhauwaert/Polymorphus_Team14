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


/**
 *
 * @author Spencer
 * @author Spencer Walters
 */
public class Polymorphus {

    public static void main(String[] args) {
        // Game class functions
        Game mainGame = new Game();
        
        mainGame.setTotalTime(30.00);
        mainGame.setMenu("Main");
        
        String gameInfo = mainGame.toString();
        System.out.println(gameInfo);
        
        //Player object functions
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // Doctor class functions
        Doctor gameDoctor = new Doctor();
        
        gameDoctor.setPayment(25);
        gameDoctor.setReturnMessage("Loved one is okay.");
        
        String doctorInfo = gameDoctor.toString();
        System.out.println(doctorInfo);
        
        // Character class functions
        Character gameCharacter = new Character();
        
        gameCharacter.setNameChar("Ogre");
        gameCharacter.setDescChar("Tall and ugly.");
        
        String characterInfo = gameCharacter.toString();
        System.out.println(characterInfo);
        
        // Castle level class functions
        CastleLevel firstLevel = new CastleLevel();
        
        firstLevel.setCol(3);
        firstLevel.setRow(5);
        
        String levelInfo = firstLevel.toString();
        System.out.println(levelInfo);
        
        // Castle room class functions
        CastleRoom tortureChamber = new CastleRoom();
        
        tortureChamber.setDescRoom("This is the torture chamber room");
        tortureChamber.setVisitRoom(1);
        
        String tortureInfo = tortureChamber.toString();
        System.out.println(tortureInfo);
        
        // Scene type class functions
        SceneType torturePuzzle = new SceneType();
        
        torturePuzzle.setDescScene("You must find a way out of this room");
        torturePuzzle.setCallingCombat(1);
        
        String puzzleInfo = torturePuzzle.toString();
        System.out.println(puzzleInfo);
        
        // Player action class functions
        PlayerAction playerAttack = new PlayerAction();
        
        playerAttack.setMixPotion(5);
        playerAttack.setCombat(9);
        
        String actionInfo = playerAttack.toString();
        System.out.println(actionInfo);
        
        //Inventory Items functions class
        InventoryItem inventoryWeapon = new InventoryItem();
        
        inventoryWeapon.setInventoryType("dagger");
        inventoryWeapon.setQuantityInStock(1);
        
        String inventory = inventoryWeapon.toString();
        System.out.println(inventory);
        
        //Map Class
        Map level = new Map();
        
        level.setColumnCount(1);
        level.setRowCount(1);
        
        String castleLevelMap = level.toString();
        System.out.println(castleLevelMap);
        
        //Inventory Bank class for descriptions
        ItemBank summary = new ItemBank();
        
        summary.setDescription("Sharp Dagger");
        
        String dagger = summary.toString();
        System.out.println(dagger);
        
        //Weapons Class
        Weapons itemWeapons = new Weapons();
        
        itemWeapons.setWeaponDescription("Sharp dagger");
        itemWeapons.setWeaponStrengh(1);
        itemWeapons.setWeaponHealth(10);
        
        String weaponItem = itemWeapons.toString();
        System.out.println(weaponItem);
        
         //Armor Class
        Armor itemarmor = new Armor();
        
        itemarmor.setArmorDescription("Leather Armor");
        itemarmor.setArmorStrengh(1);
        itemarmor.setArmorHealth(10);
        
        String armoritem = itemarmor.toString();
        System.out.println(armoritem);
        
       //Potion Class 
        Potion mixture = new Potion();
        
        mixture.setCombineItems("Mix these items");
        mixture.setPotionRecipe("Water,Blood and Powder");
        
        String potionmix = mixture.toString();
        System.out.println(potionmix);

        
   
    }
    
}
