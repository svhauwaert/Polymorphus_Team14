/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.model;

import java.io.Serializable;

/**
 *
 * @author swalters
 * Modified by Spencer Van Hauwaert
 */
public class Map implements Serializable{
   
    // Class instance vairiable
    private double rowCount;
    private double columnCount;
    private CastleRoom[][] castleRoom;
    private int noOfRows;
    private int noOfColumns;
    private int column;
    private int row;

    
    
    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if(noOfRows < 1 || noOfColumns < 1) {
        System.out.println("The number of rows and columns must be > zero");
        return;
    }
    
    this.noOfRows = noOfRows;
    this.noOfColumns = noOfColumns;
    
    // create 2-D array for castle room objects
    this.castleRoom = new CastleRoom[noOfRows][noOfColumns];
    
    for (int row = 0; row < noOfRows; row++) {
        for (int column = 0; column < noOfColumns; column++) {
            CastleRoom castleRoom = new CastleRoom();
            castleRoom.setColumn(column);
            castleRoom.setRow(row);
            castleRoom.setVisited(false);
            
            //CastleRoom[row][column] = CastleRoom;
        }
    }
    }
    
    
    public CastleRoom[][] getCastleRoom() {
        return castleRoom;
    }

    public void setCastleRoom(CastleRoom[][] castleRoom) {
        this.castleRoom = castleRoom;
    }

    

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }
}

   
    
    
    
    

