import java.util.HashSet;
import java.util.Set;

public class ResipeList {
    private static Set<Resipe> resipes = new HashSet<>();



    public static void addResipe(Resipe resipe){
        if (resipes.contains(resipe)){
            throw new IllegalArgumentException("This resipe is allready defigned");
        }
        resipes.add(resipe);
        System.out.println(resipe);
    }
    public void removeResipe(Resipe resipe) {
        resipes.remove(resipe);
    }
}
