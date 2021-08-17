
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();      

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);            

            String input = scan.nextLine();
            System.out.println("");
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputParts = input.split(" ");
            input = inputParts[0];
            int amount = Integer.valueOf(inputParts[1]);
            
            if (input.equals("add")) {
                first.add(amount);
            }
            
            if (input.equals("move")) {
                if (first.contains() < amount) {
                    second.add(first.contains()); 
                    first.remove(amount);
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            }
            
            if (input.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
