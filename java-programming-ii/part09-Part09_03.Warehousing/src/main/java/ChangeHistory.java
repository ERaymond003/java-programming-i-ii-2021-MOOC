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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } 
        double largest = this.history.get(0);
        for (int i = 0; i < this.history.size(); i++) {
            if (this.history.get(i) > largest) {
                largest = this.history.get(i);
            }
        }
        
        return largest;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } 
        double smallest = this.history.get(0);
        for (int i = 0; i < this.history.size(); i++) {
            if (this.history.get(i) < smallest) {
                smallest = this.history.get(i);
            }
        }
        
        return smallest;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        } 
        
        int count = 0;
        double sum = 0.0;
        for (int i =0; i < this.history.size(); i++) {
            count++;
            sum += this.history.get(i);
        }
        
        return sum / count;
    }
}
