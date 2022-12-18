import java.util.Objects;

public class Resipe {

    private ProductList productList;

    private int totalCost;

    private String name;

    public Resipe(String name, int totalCost, ProductList productList) {
        setName(name);
        setProductList(productList);
        setTotalCost(totalCost);

    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
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
        if (!(o instanceof Resipe)) return false;
        Resipe resipe = (Resipe) o;
        return Objects.equals(getName(), resipe.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
