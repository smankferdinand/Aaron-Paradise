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
 * @author dcars
 */
public class Provision implements Serializable{
    private String name;    
    private Boolean perishable;    

    public Provision() {
        this.name = "";
        this.perishable = false;
    }

    public Provision(String name, Boolean perishable) {
        this.name = name;
        this.perishable = perishable;
    }

    public String getName() {
        return name;
    }

    public Boolean getPerishable() {
        return perishable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerishable(Boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.perishable);
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
        final Provision other = (Provision) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.perishable, other.perishable)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Provision{" + "name=" + name + ", perishable=" + perishable + '}';
    }
    
        
}
