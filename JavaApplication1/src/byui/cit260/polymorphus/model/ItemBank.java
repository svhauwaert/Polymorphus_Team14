/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author swalters
 * Modified by Spencer Van Hauwaert -> Implementing Association Relationships
 */
public enum ItemBank implements Serializable{
    
    Statue("This is an statue of an angel covering its face with its hands."),
    Dragonscale("This is a dragonscale you got from killing the dragon. It has "
            + "a chromatic look to it."),
    Knife("You found this knife in the kitchen. Might as well use it since the"
            + " chef isn't."),
    Orange("You plucked this delicious looking fruit from the orange tree in "
            + "the arbour"),
    WaterLily("You found thid water lily to be so beautiful, that you had to "
            + "collect it and carefully store it in your pocket for later use."),
    GoldCrown("You stole this from the King's bedroom. Better not get caught "
            + "with it."),
    DiamondNecklace("This beautiful diamond necklace you found was in the "
            + "Queens bedroom."),
    Sword("This sword was once the Prince's, now it's yours."),
    potion("This potion will not save your loved one by itself, you'll need to"
            + " combine ingredients with it to find the cure."),
    cauldron("This bubbling cauldron is necessary to mix your potion.");
    
    
    
    private final String description;
    private final Point coordinates;

    ItemBank(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    @Override
    public String toString() {
        return "ItemBank{" + "description=" + description + '}';
    }
}
