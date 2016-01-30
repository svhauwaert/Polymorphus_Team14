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
public class Armor implements Serializable{
    private double armorStrengh;
    private double armorHealth;
    private String armorDescription;

    public Armor() {
    }
    
    

    public double getArmorStrengh() {
        return armorStrengh;
    }

    public void setArmorStrengh(double armorStrengh) {
        this.armorStrengh = armorStrengh;
    }

    public double getArmorHealth() {
        return armorHealth;
    }

    public void setArmorHealth(double armorHealth) {
        this.armorHealth = armorHealth;
    }

    public String getArmorDescription() {
        return armorDescription;
    }

    public void setArmorDescription(String armorDescription) {
        this.armorDescription = armorDescription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.armorStrengh) ^ (Double.doubleToLongBits(this.armorStrengh) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.armorHealth) ^ (Double.doubleToLongBits(this.armorHealth) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.armorDescription);
        return hash;
    }

    @Override
    public String toString() {
        return "Armor{" + "armorStrengh=" + armorStrengh + ", armorHealth=" + armorHealth + ", armorDescription=" + armorDescription + '}';
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
        final Armor other = (Armor) obj;
        if (Double.doubleToLongBits(this.armorStrengh) != Double.doubleToLongBits(other.armorStrengh)) {
            return false;
        }
        if (Double.doubleToLongBits(this.armorHealth) != Double.doubleToLongBits(other.armorHealth)) {
            return false;
        }
        if (!Objects.equals(this.armorDescription, other.armorDescription)) {
            return false;
        }
        return true;
    }
    
    
    
}
