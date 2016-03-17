
package byui.cit260.polymorphus.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class Character implements Serializable{
    
    // class instance variables
    private String nameChar; // characters name
    private String descChar; // description
    private int coordChar; // coordinates
    private int healthChar; // health
    private int strChar; // strength
    private int armorChar; //armor
    private int weaponChar; // weapon

    // default constructor
    public Character() {
    }

    
    public String getNameChar() {
        return nameChar;
    }

    public void setNameChar(String nameChar) {
        this.nameChar = nameChar;
    }

    public String getDescChar() {
        return descChar;
    }

    public void setDescChar(String descChar) {
        this.descChar = descChar;
    }

    public int getCoordChar() {
        return coordChar;
    }

    public void setCoordChar(int coordChar) {
        this.coordChar = coordChar;
    }

    public int getHealthChar() {
        return healthChar;
    }

    public void setHealthChar(int healthChar) {
        this.healthChar = healthChar;
    }

    public int getStrChar() {
        return strChar;
    }

    public void setStrChar(int strChar) {
        this.strChar = strChar;
    }

    public int getArmorChar() {
        return armorChar;
    }

    public void setArmorChar(int armorChar) {
        this.armorChar = armorChar;
    }

    public int getWeaponChar() {
        return weaponChar;
    }

    public void setWeaponChar(int weaponChar) {
        this.weaponChar = weaponChar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nameChar);
        hash = 67 * hash + Objects.hashCode(this.descChar);
        hash = 67 * hash + this.coordChar;
        hash = 67 * hash + this.healthChar;
        hash = 67 * hash + this.strChar;
        hash = 67 * hash + this.armorChar;
        hash = 67 * hash + this.weaponChar;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "nameChar=" + nameChar + ", descChar=" + descChar + ", coordChar=" + coordChar + ", healthChar=" + healthChar + ", strChar=" + strChar + ", armorChar=" + armorChar + ", weaponChar=" + weaponChar + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (!Objects.equals(this.nameChar, other.nameChar)) {
            return false;
        }
        if (!Objects.equals(this.descChar, other.descChar)) {
            return false;
        }
        if (this.coordChar != other.coordChar) {
            return false;
        }
        if (this.healthChar != other.healthChar) {
            return false;
        }
        if (this.strChar != other.strChar) {
            return false;
        }
        if (this.armorChar != other.armorChar) {
            return false;
        }
        if (this.weaponChar != other.weaponChar) {
            return false;
        }
        return true;
    }

    public void setReturnMessage(String loved_one_is_okay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}