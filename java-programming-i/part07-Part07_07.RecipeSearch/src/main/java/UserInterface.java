
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeList = new RecipeList();
    }

    public void start() {
        System.out.print("File to read: ");
        String fileToRead = this.scanner.nextLine();
        System.out.println("");

        FileReader fileReader = new FileReader(fileToRead, recipeList);
        fileReader.readFile();
        recipeList = fileReader.getRecipeList();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searched recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command:");
            String command = this.scanner.nextLine();
            

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                recipeList.printAllRecipes();
                System.out.println("");
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = this.scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipeList.printSearchedRecipe(searchedWord);
                System.out.println("");
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                String maxCookTime = this.scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                this.recipeList.printSearchedTime(maxCookTime);
                System.out.println("");
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchedIngredient = this.scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                this.recipeList.printSearchedIngredient(searchedIngredient);
                System.out.println("");
            }
        }
    }

}
