/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;

import java.io.Serializable;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class PlayerAction implements Serializable{
    
    // class instance variables
    private int mixPotion; // player mixes ingredients from inventory
    private int combat; //player fights character
    private int movement; // player moves --- not sure if int or string
    private int collectItem; // player collects item(s) from room
    private int callDoctor; // player contacts doctor for possible cure
    private int solvePuzzle; // player attempts to solve puzzle

    // default constructor
    public PlayerAction() {
    }

    
    
    public int getMixPotion() {
        return mixPotion;
    }

    public void setMixPotion(int mixPotion) {
        this.mixPotion = mixPotion;
    }

    public int getCombat() {
        return combat;
    }

    public void setCombat(int combat) {
        this.combat = combat;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getCollectItem() {
        return collectItem;
    }

    public void setCollectItem(int collectItem) {
        this.collectItem = collectItem;
    }

    public int getCallDoctor() {
        return callDoctor;
    }

    public void setCallDoctor(int callDoctor) {
        this.callDoctor = callDoctor;
    }

    public int getSolvePuzzle() {
        return solvePuzzle;
    }

    public void setSolvePuzzle(int solvePuzzle) {
        this.solvePuzzle = solvePuzzle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.mixPotion;
        hash = 71 * hash + this.combat;
        hash = 71 * hash + this.movement;
        hash = 71 * hash + this.collectItem;
        hash = 71 * hash + this.callDoctor;
        hash = 71 * hash + this.solvePuzzle;
        return hash;
    }

    @Override
    public String toString() {
        return "PlayerAction{" + "mixPotion=" + mixPotion + ", combat=" + combat + ", movement=" + movement + ", collectItem=" + collectItem + ", callDoctor=" + callDoctor + ", solvePuzzle=" + solvePuzzle + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayerAction other = (PlayerAction) obj;
        if (this.mixPotion != other.mixPotion) {
            return false;
        }
        if (this.combat != other.combat) {
            return false;
        }
        if (this.movement != other.movement) {
            return false;
        }
        if (this.collectItem != other.collectItem) {
            return false;
        }
        if (this.callDoctor != other.callDoctor) {
            return false;
        }
        if (this.solvePuzzle != other.solvePuzzle) {
            return false;
        }
        return true;
    }
    
    
    
}
