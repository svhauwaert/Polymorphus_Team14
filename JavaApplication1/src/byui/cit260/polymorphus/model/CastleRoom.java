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
 * @author Spencer Van Hauwaert
 */
public class CastleRoom implements Serializable{
    
    // class instance variables
    private String descRoom; // room description
    private int visitRoom; // room been visited
    private int typeRoom; // type of room
    private double travelTimeRoom; // time removed from totalTime

    // default constructor
    public CastleRoom() {
    }

    
    public String getDescRoom() {
        return descRoom;
    }

    public void setDescRoom(String descRoom) {
        this.descRoom = descRoom;
    }

    public int getVisitRoom() {
        return visitRoom;
    }

    public void setVisitRoom(int visitRoom) {
        this.visitRoom = visitRoom;
    }

    public int getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(int typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getTravelTimeRoom() {
        return travelTimeRoom;
    }

    public void setTravelTimeRoom(double travelTimeRoom) {
        this.travelTimeRoom = travelTimeRoom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.descRoom);
        hash = 41 * hash + this.visitRoom;
        hash = 41 * hash + this.typeRoom;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.travelTimeRoom) ^ (Double.doubleToLongBits(this.travelTimeRoom) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "CastleRoom{" + "descRoom=" + descRoom + ", visitRoom=" + visitRoom + ", typeRoom=" + typeRoom + ", travelTimeRoom=" + travelTimeRoom + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CastleRoom other = (CastleRoom) obj;
        if (!Objects.equals(this.descRoom, other.descRoom)) {
            return false;
        }
        if (this.visitRoom != other.visitRoom) {
            return false;
        }
        if (this.typeRoom != other.typeRoom) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTimeRoom) != Double.doubleToLongBits(other.travelTimeRoom)) {
            return false;
        }
        return true;
    }
    
    
    
}
