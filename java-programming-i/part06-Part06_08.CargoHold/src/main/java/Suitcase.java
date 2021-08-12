/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Eric R Smith
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item object : this.items) {
            totalWeight = totalWeight + object.getWeight();
        }
        if (totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        for (Item object : this.items) {
            totalWeight = totalWeight + object.getWeight();
        }
        
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight + "kg)"; 
        }
        return this.items.size() + " items (" + totalWeight + "kg)";
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item object : this.items) {
            totalWeight = totalWeight + object.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for (Item item : this.items) {
            
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
}
