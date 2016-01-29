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
 * @author swalters
 */
public class Player implements Serializable{
    // class instance variables
    private String name;
    private double bestTime;
    private double health;
    private double attackStrengh;
    private double armor;
    private double weaponClass;

    public Player() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.attackStrengh) ^ (Double.doubleToLongBits(this.attackStrengh) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.armor) ^ (Double.doubleToLongBits(this.armor) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.weaponClass) ^ (Double.doubleToLongBits(this.weaponClass) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + ", health=" + health + ", attackStrengh=" + attackStrengh + ", armor=" + armor + ", weaponClass=" + weaponClass + '}';
    }
   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attackStrengh) != Double.doubleToLongBits(other.attackStrengh)) {
            return false;
        }
        if (Double.doubleToLongBits(this.armor) != Double.doubleToLongBits(other.armor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weaponClass) != Double.doubleToLongBits(other.weaponClass)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    

    public String getName() {
        return name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public double getHealth() {
        return health;
    }

    public double getAttackStrengh() {
        return attackStrengh;
    }

    public double getArmor() {
        return armor;
    }

    public double getWeaponClass() {
        return weaponClass;
    }
            
}
