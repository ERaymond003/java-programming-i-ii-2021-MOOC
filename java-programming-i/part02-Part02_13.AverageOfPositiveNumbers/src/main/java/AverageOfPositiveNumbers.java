
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numTotal = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                sum = sum + input;
                numTotal = numTotal + 1;
            }
        }
        if (numTotal == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0 * sum / numTotal;
            System.out.println(average);
        }

    }
}
