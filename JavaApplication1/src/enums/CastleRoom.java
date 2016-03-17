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
public enum CastleRoom implements Serializable {
    
    Entrance("This is the main hall to the castle."),
    Lobby(""),
    ThroneRoom(""),
    Banquethall(""),
    StudyRoom(""),
    Library(""),
    SittingRoom(""),
    PrinceRoom(""),
    KingRoom(""),
    QueenRoom(""),
    PrincessRoom(""),
    FairyRoom(""),
    Arbour(""),
    PirateShip(""),
    Pool(""),
    CookRoom(""),
    SorcererRoom(""),
    WizardRoom(""),
    DragonKeep(""),
    Kitchen(""),
    Hall("");
    
    private final String description;
    
    CastleRoom(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
}
}
