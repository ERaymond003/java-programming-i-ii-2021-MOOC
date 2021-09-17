
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random randNum = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int numberInput = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < numberInput; i++) {
            int randomNumber = randNum.nextInt(11);
            System.out.println(randomNumber);
        }
        
    }

}
