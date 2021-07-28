import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        int index = numbers.size() - 1;
        for (int i = index; i >= 0; i--) {
            int number = numbers.get(index);
            System.out.println(number);
            index -= 1;
        }
        
        
        
    }
}
