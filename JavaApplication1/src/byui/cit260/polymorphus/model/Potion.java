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
public class Potion implements Serializable{
    private String potionRecipe;
    private String combineItems;

    public Potion() {
    }
    
    

    public String getPotionRecipe() {
        return potionRecipe;
    }

    public void setPotionRecipe(String potionRecipe) {
        this.potionRecipe = potionRecipe;
    }

    public String getCombineItems() {
        return combineItems;
    }

    public void setCombineItems(String combineItems) {
        this.combineItems = combineItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.potionRecipe);
        hash = 61 * hash + Objects.hashCode(this.combineItems);
        return hash;
    }

    @Override
    public String toString() {
        return "Potion{" + "potionRecipe=" + potionRecipe + ", combineItems=" + combineItems + '}';
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
        final Potion other = (Potion) obj;
        if (!Objects.equals(this.potionRecipe, other.potionRecipe)) {
            return false;
        }
        if (!Objects.equals(this.combineItems, other.combineItems)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
