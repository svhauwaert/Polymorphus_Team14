/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;
import java.io.Serializable;

/**
 *
 * @author Spencer
 */
public class Game implements Serializable{
    
    // clas instance variables
    private double totalTime;
    private int menu;
    private int saveGame;
    private int loadGame;

    public Game() {
    }
    
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
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
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", menu=" + menu + ", saveGame=" + saveGame + ", loadGame=" + loadGame + '}';
    }
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 47 * hash + this.menu;
        hash = 47 * hash + this.saveGame;
        hash = 47 * hash + this.loadGame;
        return hash;
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
        if (this.menu != other.menu) {
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
    
    
}
