/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class Game implements Serializable{
    
    // clas instance variables
    private double totalTime;
    private String menu;
    private int saveGame;
    private int loadGame;
    
    // Added the cardinality to the classes
    
    private Player player;
    private Character[] character; // Actors
    private Map[] map;
    private ItemBank[] itemBank;
    ArrayList<InventoryItem> inventory = new ArrayList<>();

     
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Map[] getMap() {
        return map;
    }

    public void setMap(Map[] map) {
        this.map = map;
    }

    public ItemBank[] getItemBank() {
        return itemBank;
    }

    public void setItemBank(ItemBank[] itemBank) {
        this.itemBank = itemBank;
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<InventoryItem> inventory) {
        this.inventory = inventory;
    }

    

    public Game() {
    }

    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(int saveGame) {
        this.saveGame = saveGame;
    }

    public int getLoadGame() {
        return loadGame;
    }

    public void setLoadGame(int loadGame) {
        this.loadGame = loadGame;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.menu);
        hash = 37 * hash + this.saveGame;
        hash = 37 * hash + this.loadGame;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", menu=" + menu + ", saveGame=" + saveGame + ", loadGame=" + loadGame + '}';
    }

        
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        if (this.saveGame != other.saveGame) {
            return false;
        }
        if (this.loadGame != other.loadGame) {
            return false;
        }
        return true;
    }

    public void setInventory(InventoryItem[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMap(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setItemBank(ItemBank itemBank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCharacter(java.lang.Character character) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}