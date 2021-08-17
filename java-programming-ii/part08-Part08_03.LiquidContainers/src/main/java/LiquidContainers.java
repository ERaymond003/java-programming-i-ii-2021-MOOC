
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            System.out.println("");

            if (input.equals("quit")) {
                break;
            }

            String[] inputArray = input.split(" ");
            int number = Integer.valueOf(inputArray[1]);

            if (inputArray[0].equals("add")) {

                if (number < 0) {
                    continue;
                }
                if (first + number > 100) {
                    first = 100;
                } else {
                    first += number;
                }
            }

            if (inputArray[0].equals("move")) {
                if (number < 0) {
                    continue;
                }
                if (first - number < 0) {
                    if (second + first > 100) {
                        second = 100;
                    } else {
                        second += first;
                    }
                    first = 0;
                } else {
                    first -= number;
                    if (second + number > 100) {
                        second = 100;
                    } else {
                        second += number;
                    }

                }
            }

            if (inputArray[0].equals("remove")) {
                if (number < 0) {
                    continue;
                }
                if (second - number < 0) {
                    second = 0;
                } else {
                    second -= number;
                }
            }

        }
    }

}
