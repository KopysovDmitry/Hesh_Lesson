import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();
        ProductList productList = new ProductList(products);
        Product milk = new Product("Молоко",10,10);
        Product bread = new Product("Хлеб",10,10);
        Product bananas = new Product("Бананы",10,10);
        
        productList.addProduct(milk);
        productList.addProduct(bananas);
        productList.addProduct(bread);
        System.out.println("Products is have: " + products);

        productList.removeProduct(bread);
        System.out.println("Products is have: " + products);

        Recipe olivie = new Recipe("Olivie",100,  products);


        Set<Recipe> recipes = new HashSet<>();

        ResipeList resipeList = new ResipeList(recipes);

        resipeList.addRecipe(olivie);





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

        System.out.println("");

        Task task1 = new Task(2,'*',2);
        Task task2 = new Task(2,'*',3);
        Task task3 = new Task(2,'*',4);
        Task task4 = new Task(2,'*',5);
        Task task5 = new Task(2,'*',6);
        Task task6 = new Task(2,'*',7);
        Task task7 = new Task(2,'*',8);
        Task task8 = new Task(2,'*',9);
        Task task9 = new Task(2,'*',10);
        Task task10 = new Task(2,'*',11);
        Task task11 = new Task(2,'*',12);
        Task task12 = new Task(2,'*',13);
        Task task13 = new Task(2,'*',14);
        Task task14 = new Task(2,'*',15);
        Task task15 = new Task(2,'*',16);
        Task task16 = new Task(2,'*',16);

        Set<Task> tasks = new HashSet<>();
        TaskList taskList = new TaskList(tasks);

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskList.addTask(task4);
        taskList.addTask(task5);
        taskList.addTask(task6);
        taskList.addTask(task7);
        taskList.addTask(task8);
        taskList.addTask(task9);
        taskList.addTask(task10);
        taskList.addTask(task11);
        taskList.addTask(task12);
        taskList.addTask(task13);
        taskList.addTask(task14);
        taskList.addTask(task15);

        Passport passport1 = new Passport(111,"Ivanov","Ivan"," ",01,01,1999);
        Passport passport2 = new Passport(222,"Petrov","Petr","Petrovich",20,12,2022 );

        Set<Passport> passports = new HashSet<>();
        PassportList passportList = new PassportList(passports);

        passportList.addPassport(passport1);
        passportList.addPassport(passport2);


        passportList.findPassport(passport1);


    }


}







