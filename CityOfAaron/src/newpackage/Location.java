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
public class Location implements Serializable{
    // class variiable
    private int    NameId;
    private String address;
    private String description;
    private Scena scena;

    public int getNameId() {
        return NameId;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public Scena getScena() {
        return scena;
    }

    public void setNameId(int NameId) {
        this.NameId = NameId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setScena(Scena scena) {
        this.scena = scena;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.address);
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + Objects.hashCode(this.scena);
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
        if (!Objects.equals(this.scena, other.scena)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "NameId=" + NameId + ", address=" + address + ", description=" + description + ", scena=" + scena + '}';
    }

    public Location(int NameId, String address, String description, Scena scena) {
        this.NameId = NameId;
        this.address = address;
        this.description = description;
        this.scena = scena;
    }

    public Location() {
    }
    
    
}
