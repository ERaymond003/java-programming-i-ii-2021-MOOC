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
public class Package {
    private ArrayList<Gift> gifts;
    
    public Package() {
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        if (gifts.size() == 0) {
            return 0;
        }
        int totalWeight = 0;
        
        for (Gift gift : gifts) {
            totalWeight = totalWeight + gift.getWeight();
            
        }
        return totalWeight;
       
    }
}
