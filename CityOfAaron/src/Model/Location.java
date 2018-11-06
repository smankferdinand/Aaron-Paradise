/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author rmonzon
 */
public class Location implements Serializable{
    // class variiable
    private int    NameId;
    private String address;
    private String description;

    public Location(int NameId, String address, String description) {
        this.NameId = NameId;
        this.address = address;
        this.description = description;
    }

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.NameId;
        hash = 31 * hash + Objects.hashCode(this.address);
        hash = 31 * hash + Objects.hashCode(this.description);
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
        final Location other = (Location) obj;
        if (this.NameId != other.NameId) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    public int getNameId() {
        return NameId;
    }

    public void setNameId(int NameId) {
        this.NameId = NameId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Location{" + "NameId=" + NameId + ", address=" + address + ", description=" + description + '}';
    }

 
    
}
   
