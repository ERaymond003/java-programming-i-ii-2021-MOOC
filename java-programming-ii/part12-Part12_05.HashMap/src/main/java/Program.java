
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.add(5, "First");
        hash.add(6, "Second");
        hash.add(7, "Third");
        
        System.out.println(hash.get(5));
        
        hash.remove(5);
        
        System.out.println(hash.get(5));

    }

}
