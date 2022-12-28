import java.util.HashSet;
import java.util.Set;

public class ProductList {

 private  Set<Product> products;


    public ProductList(Set<Product> products) {
        this.products = products;
    }

    public  void addProduct(Product product){
      if (products.contains(product)){
          throw new IllegalArgumentException("This product is allready defigned");
      }
      products.add(product);
      System.out.println("Vi dobavili: " +product.getName());
  }
  public void removeProduct(Product product){
      products.remove(product);
      System.out.println("Vi udalili: " + product.getName());
  }

}
