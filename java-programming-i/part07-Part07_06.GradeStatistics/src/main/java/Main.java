
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        UserInterface UI = new UserInterface(new Scanner(System.in), new Grades());
        
        UI.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
