
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numTotal = 0;
        
        while (true) {
            System.out.println("Give a number:");
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            sum = sum + input;
            numTotal = numTotal + 1;
        }
        
        double average = 1.0 * sum / numTotal;
        System.out.println("Average of the numbers: " + average);

    }
}
