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

    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();

    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int index = 1;
        for (String todo : this.todoList) {
            System.out.println(index + ": " + todo);
            index++;
        }
    }
    
    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
}
