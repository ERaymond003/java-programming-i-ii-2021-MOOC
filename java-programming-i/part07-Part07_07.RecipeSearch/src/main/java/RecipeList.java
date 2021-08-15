
import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printAllRecipes() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void printSearchedRecipe(String searchedWord) {
        for (Recipe recipe : this.recipes) {
            if (recipe.contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }

    public void printSearchedTime(String searchedWord) {
        int maxCookTime = Integer.valueOf(searchedWord);
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookTime() <= maxCookTime) {
                System.out.println(recipe);
            }
        }
    }

    public void printSearchedIngredient(String searchedWord) {
        for (Recipe recipe : this.recipes) {
            if(recipe.getIngredients().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }

}
