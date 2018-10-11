/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author rmonzon
 */
public class Game implements Serializable{
    //Class instance Variables
    private String name;
    private String map;
    private int    currentPopulation;
    private int    acresOwned;
    private int    whealtInStorage;
// Build the contructor 
    public Game() {
    }
    // Generate all the getter and setter 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWhealtInStorage() {
        return whealtInStorage;
    }

    public void setWhealtInStorage(int whealtInStorage) {
        this.whealtInStorage = whealtInStorage;
    }
/// Generate hashCode and Equals 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.map);
        hash = 97 * hash + this.currentPopulation;
        hash = 97 * hash + this.acresOwned;
        hash = 97 * hash + this.whealtInStorage;
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
        final Game other = (Game) obj;
        if (this.currentPopulation != other.currentPopulation) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.whealtInStorage != other.whealtInStorage) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", map=" + map + ", currentPopulation=" + currentPopulation + ", acresOwned=" + acresOwned + ", whealtInStorage=" + whealtInStorage + '}';
    }
    
    
    
}
