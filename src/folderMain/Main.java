package folderMain;

import menuFile.MenuOptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static MenuOptions menu = new MenuOptions();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {


        firstChoiceToStartOrExitProgram();



        //menu.printProductThatIsLowestPrice();
        //menu.printProductsThatIsHighestPrice();
        //menu.printProductInStock();
        //System.out.println(re.getProductData());
        // ArrayList<Product> productList= re.getProductData();
        // System.out.println(productList);
        //int min=productList.get(0).getPrice();
        //Get the lowest price of the products.
        //productList.sort(Comparator.comparingInt(Product::getPrice));
        //productList.forEach(System.out::println);
        // System.out.println(productList.stream().min(Comparator.comparing(Product::getPrice)));
        //Get the lowest price of alla product and print them out;
        //for (int i = 1; i < productList.size(); i++) {
        //if (productList.get(i).getPrice() < min) {
        //min = productList.get(i).getPrice();
        //}
        //}
        //for (Product po:productList) {
        //     System.out.println(po);
        //}
        //   System.out.println();

    }

    private static void firstChoiceToStartOrExitProgram() {
        System.out.println("""
                1:Start Program:
                2:Exit Program:
                Please Type in 1 or 2 to make your choice: 
                
                """);
        int choice = in.nextInt();
        in.nextLine();

        switch (choice) {

            case 1 -> choicesYouCanGet();
            case 2 -> menu.exitProgram();
        }
    }
    private static void choicesYouCanGet(){
        menu.startProgram();
        System.out.println("""
                1: Would you like to get all the products in the file:
                2: Would you like to add a new product to the file:
                3: Would you like to remove a product from the file:
                4: Would you like to get the highest price of all products:
                5: Would you like to get the smallest price of all products:
                Please Type in a number to make your choice: 
                
                """);
        int choice = in.nextInt();
        in.nextLine();
        switch (choice){
            case 1-> menu.printProductInStock();
            case 2->menu.addProductsToList();
            case 3-> menu.removeProductFromStock();
            case 4-> menu.printProductsThatIsHighestPrice();
            case 5-> menu.printProductThatIsLowestPrice();

        }



    }
}
