/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 * 
 * @author Smank Ferdinand
 */
public enum ItemType {
    NAME("Rats","true"),
    STATE("Rice","false");
    
    // class variables 
    private final String animal;
    private final String provision;
    // Contructor 
    ItemType(String animal, String provision){
        this.animal = animal;
        this.provision = provision;
    }
   // Getter statement
    public String getAnimal() {
        return animal;
    }

    public String getProvision() {
        return provision;
    }

    @Override
    public String toString() {
        return "ItemType{" + "animal=" + animal + ", provision=" + provision + '}';
    }
    
    
    
}

