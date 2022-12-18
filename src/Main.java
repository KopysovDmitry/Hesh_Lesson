import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main extends ProductList {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();

        addProduct(new Product("Молоко",10,10));
        addProduct(new Product("Хлеб",10,10));
        addProduct(new Product("Бананы",10,10));

        Set<Resipe> resipes = new HashSet<>();

//        addResipe(new Resipe())

        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() <20){
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number %2==1){
                iterator.remove();
            }
        }
        System.out.println(numbers);


    }

}







