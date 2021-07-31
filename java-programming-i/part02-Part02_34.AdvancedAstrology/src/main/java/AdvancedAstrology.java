
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
        // part 1 of the exercise
    }

    public static void printSpaces(int number) {
        int i = 1;
        while (i <= number) {
            System.out.print(" ");
            i++;
        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i + (i-1));
            i++;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
        
        
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
