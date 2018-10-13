/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Objects;

/**
 *
 * @author Rafael.M
 */
public class InventoryItem {
    
    private String Name;
    private ItemType ItemType;
    private int Quantity;
    private Condition Condition;
    private Double pricePerUnit;
    private int rows;
    private int columns;
    private Map Map;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ItemType getItemType() {
        return ItemType;
    }

    public void setItemType(ItemType ItemType) {
        this.ItemType = ItemType;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Condition getCondition() {
        return Condition;
    }

    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Map getMap() {
        return Map;
    }

    public void setMap(Map Map) {
        this.Map = Map;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "Name=" + Name + ", ItemType=" + ItemType + ", Quantity=" + Quantity + ", Condition=" + Condition + ", pricePerUnit=" + pricePerUnit + ", rows=" + rows + ", columns=" + columns + ", Map=" + Map + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.Name);
        hash = 23 * hash + Objects.hashCode(this.ItemType);
        hash = 23 * hash + this.Quantity;
        hash = 23 * hash + Objects.hashCode(this.Condition);
        hash = 23 * hash + Objects.hashCode(this.pricePerUnit);
        hash = 23 * hash + this.rows;
        hash = 23 * hash + this.columns;
        hash = 23 * hash + Objects.hashCode(this.Map);
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.Quantity != other.Quantity) {
            return false;
        }
        if (this.rows != other.rows) {
            return false;
        }
        if (this.columns != other.columns) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (this.ItemType != other.ItemType) {
            return false;
        }
        if (this.Condition != other.Condition) {
            return false;
        }
        if (!Objects.equals(this.pricePerUnit, other.pricePerUnit)) {
            return false;
        }
        if (!Objects.equals(this.Map, other.Map)) {
            return false;
        }
        return true;
    }
    
    
    
}
