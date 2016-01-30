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
public class Weapons implements Serializable{
    private double weaponStrengh;
    private double weaponHealth;
    private String weaponDescription;

    public Weapons() {
    }
    
    
    

    public double getWeaponStrengh() {
        return weaponStrengh;
    }

    public void setWeaponStrengh(double weaponStrengh) {
        this.weaponStrengh = weaponStrengh;
    }

    public double getWeaponHealth() {
        return weaponHealth;
    }

    public void setWeaponHealth(double weaponHealth) {
        this.weaponHealth = weaponHealth;
    }

    public String getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.weaponStrengh) ^ (Double.doubleToLongBits(this.weaponStrengh) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.weaponHealth) ^ (Double.doubleToLongBits(this.weaponHealth) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.weaponDescription);
        return hash;
    }

    @Override
    public String toString() {
        return "Weapons{" + "weaponStrengh=" + weaponStrengh + ", weaponHealth=" + weaponHealth + ", weaponDescription=" + weaponDescription + '}';
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
        final Weapons other = (Weapons) obj;
        if (Double.doubleToLongBits(this.weaponStrengh) != Double.doubleToLongBits(other.weaponStrengh)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weaponHealth) != Double.doubleToLongBits(other.weaponHealth)) {
            return false;
        }
        if (!Objects.equals(this.weaponDescription, other.weaponDescription)) {
            return false;
        }
        return true;
    }
    
    
    
           
    
}
