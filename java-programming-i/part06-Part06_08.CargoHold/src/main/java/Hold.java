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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        
        for (Suitcase suitcaseObject : this.suitcases) {
            totalWeight = totalWeight + suitcaseObject.totalWeight();
        }
        
        if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        for (Suitcase object : this.suitcases) {
            totalWeight = totalWeight + object.totalWeight();
        }
        
        if (this.suitcases.size() == 0) {
            return "no suitcases (0 kg)";
        }
        
        if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + totalWeight + "kg)"; 
        }
        return this.suitcases.size() + " suitcases (" + totalWeight + "kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
