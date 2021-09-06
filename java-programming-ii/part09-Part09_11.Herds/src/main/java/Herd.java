/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Eric R Smith
 */
public class Herd implements Movable{
    private List<Movable> organisms;
       
    public Herd() {
        this.organisms = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String finalString = "";
        for (Movable organism : this.organisms) {
            finalString = finalString + organism + "\n";
        }
        return finalString;
    }
    
    public void addToHerd(Movable movable) {
        this.organisms.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable organism : this.organisms) {
            organism.move(dx, dy);
        }
    }
}
