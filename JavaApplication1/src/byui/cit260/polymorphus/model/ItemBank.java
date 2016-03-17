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
    
    Key("This is a key to unlock a door."),
    Torch("This is a torch to be used in dark rooms.");
    
    
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
