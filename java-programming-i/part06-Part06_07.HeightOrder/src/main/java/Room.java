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
public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        if (this.people.size() > 0) {
            return false;
        } 
        return true;
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if (this.people.size() == 0) {
            return null;
        }
        
        Person returnObject = people.get(0);
        
        for (Person person : people) {
            
            if (returnObject.getHeight() > person.getHeight()) {
                returnObject = person;
            }
        }
        
        return returnObject;
    }
    
    public Person take() {
        if (this.people.size() == 0) {
            return null;
        }
        Person removeObject = people.get(0);
        
        for (Person person : people) {
            
            if (removeObject.getHeight() > person.getHeight()) {
                removeObject = person;
            }
        }
        people.remove(removeObject);
        return removeObject;
    }
}
