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
public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public String take() {
        int topIndex = this.list.size() - 1;
        String topValue = this.list.get(topIndex);
        this.list.remove(topIndex);
        return topValue;
    }
}
