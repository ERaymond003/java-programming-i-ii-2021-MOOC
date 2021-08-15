
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReader {

    private RecipeList recipeList;
    private String file;

    public FileReader(String file, RecipeList recipeList) {
        this.recipeList = recipeList;
        this.file = file;
    }

    public void readFile() {
        ArrayList<String> ingredients = new ArrayList<>();

        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {
            String recipeString = "";
            String[] recipeArray;

            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    recipeArray = recipeString.split(",");
                    for (int i = 2; i < recipeArray.length; i++) {
                        ingredients.add(recipeArray[i]);
                    }
                    Recipe recipe = new Recipe(recipeArray[0], Integer.valueOf(recipeArray[1]), ingredients);
                    recipeList.add(recipe);
                    recipeString = "";
                    ingredients = new ArrayList<>();
                } else {
                    recipeString += row;
                    recipeString += ",";
                }

            }
            recipeArray = recipeString.split(",");
            for (int i = 2; i < recipeArray.length; i++) {
                ingredients.add(recipeArray[i]);
            }
            Recipe recipe = new Recipe(recipeArray[0], Integer.valueOf(recipeArray[1]), ingredients);
            recipeList.add(recipe);
            

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public RecipeList getRecipeList() {
        return recipeList;
    }
}
