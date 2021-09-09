
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> entries = new ArrayList<>();
        
        
        while (true) {
            String entry = scanner.nextLine();
            
            if (entry.equals("")) {
                break;
            }
            
            entries.add(entry);
        }
        
        entries.stream().forEach(l -> System.out.println(l));

       

    }
}
