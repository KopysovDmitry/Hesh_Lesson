import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Product {

    private String name;
    private int cost;
    private int amount;

    public Product(String name, int cost, int amount) {
        setName(name);
       setAmount(amount);
       setCost(cost);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Data Name is empty");
        }
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost <=0){
            throw new IllegalArgumentException("Data Cost is empty");
        }
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount <=0){
            throw new IllegalArgumentException("Data Amount is empty");
        }
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                '}';
    }
}
