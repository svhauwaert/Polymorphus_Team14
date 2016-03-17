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
public enum Character implements Serializable {
    
    Dragon("It is a huge looking monster with huge teeth sticking out and drool."),
    Fairy("He is a very large fat ugly looking humanoid. He looks like he could hurt you very badly."),
    Sorcerer(""),
    Wizard(""),
    Parrot(""),
    Baboon(""),
    Cobra(""),
    Princess(""),
    Prince(""),
    King(""),
    Queen(""),
    Cook(""),
    DragonKeeper(""),
    Pirate(""),
    FirstMate("");
    
    private final String description;
    
    Character(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
}
