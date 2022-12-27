import java.util.HashSet;
import java.util.Set;

public class ProductList {

 private  Set<Product> products;




    public  void addProduct(Product product){
      if (products.contains(product)){
          throw new IllegalArgumentException("This product is allready defigned");
      }
      products.add(product);
      System.out.println(product);
  }
  public void removeProduct(Product product){
      products.remove(product);
  }

}
