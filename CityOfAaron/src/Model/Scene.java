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
 * @author Rafael.M
 * @author dcars
 * @author smankferdinand
 */
public class Scene implements Serializable{
    private String name;    
    private String description;    
    private Question question;
    private InventoryItem inventoryItem;

    public Scene(String name, String description, Question question, InventoryItem inventoryItem) {
        this.name = name;
        this.description = description;
        this.question = question;
        this.inventoryItem = inventoryItem;
    }

    
    public Scene() {
        this.name = "";
        this.description = "";
        this.question = null;
        this.inventoryItem = null;
    }

    
    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", question=" + question + ", inventoryItem=" + inventoryItem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.question);
        hash = 53 * hash + Objects.hashCode(this.inventoryItem);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        return true;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Question getQuestion() {
        return question;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }
}
