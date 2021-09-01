/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Eric R Smith
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;
    
    public StorageFacility() {
        this.storageUnits= new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit, new ArrayList<>());
        
        this.storageUnits.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        this.storageUnits.get(storageUnit).remove(item);
        
        if (this.storageUnits.get(storageUnit).isEmpty()) {
            this.storageUnits.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> keyList = new ArrayList<>(this.storageUnits.keySet());
        return keyList;
    }
}
