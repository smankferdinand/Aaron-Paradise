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
 * @author smankferdinand
 */
public class Author implements Serializable{
    private String name;    

    public Author() {
        this.name = "";
    }

    public int hashCode() {
        int hash = 5;
        hash = 10 * hash + Objects.hashCode(this.name);
        return hash;
    }

    
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
        final Author other = (Author) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    
    public String toString() {
        return "author{" + "name=" + name + '}';
    }
       

    public String getName() {
        return name;
    }
}
