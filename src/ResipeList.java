import java.util.Set;

public class ResipeList {
    private static Set<Recipe> recipes;

    public  ResipeList(Set<Recipe> resipes) {
        this.recipes = resipes;
    }

    public void addRecipe(Recipe recipe){
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException("This resipe is allready defigned");
        }
        recipes.add(recipe);
        System.out.println(recipe);
    }
    public void removeResipe(Recipe resipe) {
        recipes.remove(resipe);
    }

    @Override
    public String toString() {
        return "ResipeList{}";
    }
}
