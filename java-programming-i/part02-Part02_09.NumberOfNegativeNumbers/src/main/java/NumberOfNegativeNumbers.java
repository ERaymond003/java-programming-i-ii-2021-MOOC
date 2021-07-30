
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int numGiven = Integer.valueOf(scanner.nextLine());
            if (numGiven == 0) {
                break;
            }
            if (numGiven < 0) {
                negNum = negNum + 1;
            }
        }
        
        System.out.println("Number of negative numbers: " + negNum);

    }
}
