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


/**
 *
 * @author Spencer
 * @author Spencer Walters
 */
public class Polymorphus {

    public static void main(String[] args) {
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
        
        //Inventory Items functions class
        InventoryItem inventoryitem = new InventoryItem();
        
        inventoryitem.setInventoyType("dagger");
        inventoryitem.setQuantityInStock(1);
        
        String inventory = inventoryitem.toString();
        System.out.println(inventory);
        
        //Map Class
        Map level = new Map();
        
        level.setColumnCount(1);
        level.setRowCount(1);
        
        String castlelevel = level.toString();
        System.out.println(castlelevel);
        
        //Inventory Bank class for descriptions
        ItemBank summary = new ItemBank();
        
        summary.setDescription("Sharp Dagger");
        
        String dagger = summary.toString();
        System.out.println(dagger);
        
        //Weapons Class
        Weapons itemweapons = new Weapons();
        
        itemweapons.setWeaponDescription("Sharp dagger");
        itemweapons.setWeaponStrengh(1);
        itemweapons.setWeaponHealth(10);
        
        String weaponitem = itemweapons.toString();
        System.out.println(weaponitem);
        
         //Armor Class
        Armor itemarmor = new Armor();
        
        itemarmor.setArmorDescription("Leather Armor");
        itemarmor.setArmorStrengh(1);
        itemarmor.setArmorHealth(10);
        
        String armoritem = itemarmor.toString();
        System.out.println(armoritem);
        
        
        
    }
    
}
