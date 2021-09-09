
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> entries = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            String entry = scanner.nextLine();
            
            if (entry.equals("end")) {
                break;
            }
            
            entries.add(entry);
        }
        
        double positive = entries.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();
        
        double negative = entries.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String posOrNeg = scanner.nextLine();
        if (posOrNeg.equals("n")) {
            System.out.println("Average of the nagative numbers: " + negative);
        } else {
            System.out.println("Average of the positive numbers: " + positive);
        }
        

    }
}
