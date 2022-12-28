import java.util.Objects;
import java.util.Set;

public class Recipe  {

    private Set<Product> productList;

    private int totalCost;

    private String name;

    public Recipe(String name, int totalCost, Set<Product> productList) {
        setName(name);
        setProductList(productList);
  //      setTotalCost(totalCost);

    }

    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost() {
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(getName(), recipe.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}

