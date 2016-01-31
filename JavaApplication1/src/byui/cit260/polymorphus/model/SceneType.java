/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class SceneType implements Serializable{
    
    // class instance variables
    private String descScene; // description of the type of scene in the room
    private int travelTimeScene; // time removed from totalTime due to scene
    private int itemAvail; // is item available for player
    private int callingCombat; // player decides to fight

    // default constructor
    public SceneType() {
    }

    
    
    public String getDescScene() {
        return descScene;
    }

    public void setDescScene(String descScene) {
        this.descScene = descScene;
    }

    public int getTravelTimeScene() {
        return travelTimeScene;
    }

    public void setTravelTimeScene(int travelTimeScene) {
        this.travelTimeScene = travelTimeScene;
    }

    public int getItemAvail() {
        return itemAvail;
    }

    public void setItemAvail(int itemAvail) {
        this.itemAvail = itemAvail;
    }

    public int getCallingCombat() {
        return callingCombat;
    }

    public void setCallingCombat(int callingCombat) {
        this.callingCombat = callingCombat;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.descScene);
        hash = 23 * hash + this.travelTimeScene;
        hash = 23 * hash + this.itemAvail;
        hash = 23 * hash + this.callingCombat;
        return hash;
    }

    @Override
    public String toString() {
        return "SceneType{" + "descScene=" + descScene + ", travelTimeScene=" + travelTimeScene + ", itemAvail=" + itemAvail + ", callingCombat=" + callingCombat + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SceneType other = (SceneType) obj;
        if (!Objects.equals(this.descScene, other.descScene)) {
            return false;
        }
        if (this.travelTimeScene != other.travelTimeScene) {
            return false;
        }
        if (this.itemAvail != other.itemAvail) {
            return false;
        }
        if (this.callingCombat != other.callingCombat) {
            return false;
        }
        return true;
    }
    
    
    
}
