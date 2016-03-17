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
    
    Statue("It is a huge looking monster with huge teeth sticking out and drool."),
    Throne("He is a very large fat ugly looking humanoid. He looks like he could hurt you very badly."),
    DragonScale(""),
    OrangeFruit(""),
    WaterLily(""),
    GoldCrown(""),
    DiamondNecklace(""),
    Sword(""),
    Staff(""),
    Ring(""),
    Cauldron(""),
    Apron(""),
    Wand(""),
    Pighead(""),
    Book("Encyclopedia"),
    Fireplace("");
    
    private final String description;
    
    Items(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
}