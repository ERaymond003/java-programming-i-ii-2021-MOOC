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
public class Box implements Packable {

    private double maxWeight;

    private int itemCount;
    private ArrayList<Packable> itemList;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;

        this.itemCount = 0;
        this.itemList = new ArrayList<>();
    }

    public void add(Packable packable) {

        if (this.maxWeight > this.weight() + packable.weight()) {
            this.itemList.add(packable);
            this.itemCount++;
        }
    }

    public double weight() {
        double weight = 0;
        if (!this.itemList.isEmpty()) {
            for (Packable item : this.itemList) {
                weight += item.weight();
            }
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.itemCount + " items, total weight " + this.weight() + " kg";
    }
}
