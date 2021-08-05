
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            
            int found = 0;

            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                if (row.equals(searchedFor)) {
                    System.out.println("Found it!");
                    found += 1;
                    break;
                }
                

            }
            if (found == 0) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
