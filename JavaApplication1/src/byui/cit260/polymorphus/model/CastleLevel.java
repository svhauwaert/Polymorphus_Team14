/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;

import java.io.Serializable;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class CastleLevel implements Serializable{
    
    // class instance variables
    private int row; // row coordinate for map
    private int col; // column coordinate for map
    private int visitLevel; // has the player been to this level yet?
    private int notVisitedLevel; // not sure if this variable is needed -- see above --

    // default constructor
    public CastleLevel() {
    }

    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getVisitLevel() {
        return visitLevel;
    }

    public void setVisitLevel(int visitLevel) {
        this.visitLevel = visitLevel;
    }

    public int getNotVisitedLevel() {
        return notVisitedLevel;
    }

    public void setNotVisitedLevel(int notVisitedLevel) {
        this.notVisitedLevel = notVisitedLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.row;
        hash = 31 * hash + this.col;
        hash = 31 * hash + this.visitLevel;
        hash = 31 * hash + this.notVisitedLevel;
        return hash;
    }

    @Override
    public String toString() {
        return "CastleLevel{" + "row=" + row + ", col=" + col + ", visitLevel=" + visitLevel + ", notVisitedLevel=" + notVisitedLevel + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CastleLevel other = (CastleLevel) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (this.visitLevel != other.visitLevel) {
            return false;
        }
        if (this.notVisitedLevel != other.notVisitedLevel) {
            return false;
        }
        return true;
    }
    
    
    
}
