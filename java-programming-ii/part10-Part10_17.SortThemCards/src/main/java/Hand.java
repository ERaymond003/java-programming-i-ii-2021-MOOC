/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.stream.Collectors;
/**
 *
 * @author Eric R Smith
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public int handValue() {
        int value = 0;
        for (Card card : this.hand) {
            value += card.getValue();
        }
        
        return value;
    }
    
    public void print() {
        Iterator iterator = this.hand.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public int compareTo(Hand hand) {
        return this.handValue() - hand.handValue();
    }
    
    public void sortBySuit() {
        BySuitInValueOrder sorter = new BySuitInValueOrder();
        Collections.sort(this.hand, sorter);
        
        
        
    }
}
