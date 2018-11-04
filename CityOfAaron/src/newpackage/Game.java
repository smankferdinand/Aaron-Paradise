/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author rmonzon
 */
public class Game implements Serializable{
    //Class instance Variables
    private Player player;
    private Map     map;
    private int    currentPopulation;
    private int    acresOwned;
    private int    whealtInStorage;
    
// Build the contructor 
    public Game() {
        this.player = null;
        this.map = null;
        this.currentPopulation = 0;
        this.acresOwned = 0;
        this.whealtInStorage =0;
    }

    public Game(Player player, Map map, int currentPopulation, int acresOwned, int whealtInStorage) {
        this.player = player;
        this.map = map;
        this.currentPopulation = currentPopulation;
        this.acresOwned = acresOwned;
        this.whealtInStorage = whealtInStorage;
    }
    
    
    // Generate all the getter and setter 
    public String getName() {
        return player.getName();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public String getMapLocation() {
        return Arrays.toString(map.getLocation());
    }

    public void setMap(Map map) {
        map.setPoints(map.getPoints());
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.player);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }
}