
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name  + " is empty.";
        }
        
        String output = "";
        int count = 0;
        
        for (String element : elements) {
            output = output + "\n" + element;
            count++;
        }
        
        if (elements.size() == 1) {
            return "The collection " + this.name  + " has " + count + " element:" + output; 
        }
        
        

        return "The collection " + this.name  + " has " + count + " elements:" + output;
    }

}
