import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList();
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = this.scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = this.scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                this.birds.add(bird);
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdObserved = this.scanner.nextLine();
                int count = 0;
                for (Bird bird : this.birds) {
                    if (bird.getName().equals(birdObserved)) {
                        bird.observe();
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }
            }
            
            if (command.equals("All")) {
                for (Bird bird : this.birds) {
                    System.out.println(bird);
                }
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdSearched = this.scanner.nextLine();
                for (Bird bird : this.birds) {
                    if (bird.getName().equals(birdSearched)) {
                        System.out.println(bird);
                    }
                }
            }
            
        }
    }
}
