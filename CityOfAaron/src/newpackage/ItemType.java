/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


/**
 *
 * @author dcars
 */
public enum ItemType {
    David(),
    Rafael();

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setProvision(Provision provision) {
        this.provision = provision;
    }
    private Animal animal;
    private Provision provision;
    ItemType(Animal animal, String tool, Provision provision){
        this.animal = animal;
        this.provision = provision;
    }
}

