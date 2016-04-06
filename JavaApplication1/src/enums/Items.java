/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.io.Serializable;

/**
 *
 * @author Spencer
 */
public enum Items implements Serializable {
    
    Statue("Weeping Angel"),
    Throne("Gold Throne"),
    DragonScale("Chromatic"),
    OrangeFruit("Juicy fruit"),
    WaterLily("Pretty flower"),
    GoldCrown("Golden Crown"),
    DiamondNecklace("Diamond Necklace"),
    Sword("Sharp bladed sword"),
    Staff("Old Wooden Staff"),
    Ring("Pearl ring"),
    Cauldron("Large black cauldron"),
    Apron("Bloody stained apron"),
    Wand("Thin star tipped wand"),
    Pighead("Rosted pighead with apple in the mouth"),
    Book("Encyclopedia");
        
    private final String description;
    
    Items(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
}