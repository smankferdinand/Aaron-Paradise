/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.Arrays;
/**
 *
 * @author rmonzon
 */
public class Map implements Serializable{
    // Class variable 
   private int[][] location;
   private int[][] points;   

    public Map() {
        int [][] arr= {};
        location =  arr;
        points =  arr;
    }

       public void setLocation(int[][] location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Arrays.deepHashCode(this.location);
        hash = 31 * hash + Arrays.deepHashCode(this.points);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        if (!Arrays.deepEquals(this.points, other.points)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "location=" + location + ", points=" + points + '}';
    }

    public int[][] getLocation() {
        return location;
    }

    public int[][] getPoints() {
        return points;
    }

    public void setPoints(int[][] points) {
        this.points = points;
    }

}
