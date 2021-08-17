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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        
        
        for(String task : this.list) {
            System.out.println((this.list.indexOf(task) + 1) + ": " +task);
        }
    }
    
    public void remove(int number) {
        this.list.remove(this.list.get((number - 1)));
    }
}
