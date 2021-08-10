/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric R Smith
 */
public class Item {
    private String name;
    private String identifier;
    
    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }
        return false;
    }
}
