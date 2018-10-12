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
    private Animal animal;
    private String tool;
    private Provision provision;
    ItemType(Animal animal, String tool, Provision provision){
        this.animal = animal;
        this.tool = tool;
        this.provision = provision;
    }
}

