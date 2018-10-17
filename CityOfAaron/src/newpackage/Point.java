/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.Serializable;
/**
 *
 * @author rmonzon
 */
public class Point implements Serializable{
    // Class variable 
    private int rows;
    private int columns; 

    public Point() {
        this.rows = 0;
        this.columns = 0;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.rows;
        hash = 83 * hash + this.columns;
        return hash;
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
        final Point other = (Point) obj;
        if (this.rows != other.rows) {
            return false;
        }
        if (this.columns != other.columns) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Point{" + "rows=" + rows + ", columns=" + columns + '}';
    }

    public Point(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    
}
