import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();
        
        Product milk = new Product("Молоко",10,10);
        Product bread = new Product("Хлеб",10,10);
        Product bananas = new Product("Бананы",10,10);
        
        products.add(milk);
        products.add(bread);
        products.add(bananas);

        System.out.println("Products is have: " + products);

        Recipe recipe = new Recipe("Olivie",100,  products);
        System.out.println("Recipe is have: " +recipe);

        Set<Recipe> recipeList = new HashSet<>();




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







