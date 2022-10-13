package folderMain;

import menuFile.MenuOptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static MenuOptions menu = new MenuOptions();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        choiceToStartOrExitProgram();
    }

    private static void choiceToStartOrExitProgram() {
        System.out.println("""
                1:Start Program:
                2:Exit Program:
                Please Type in 1 or 2 to make your choice: 
                                
                """);

        int choice = in.nextInt();
        in.nextLine();

        switch (choice) {

            case 1 -> printChoices();
            case 2 -> menu.exitProgram();
        }

    }

    private static void printChoices() {
        menu.startProgram();

        while (true) {
            System.out.println("""
                    1: Would you like to get all the products in the file:
                    2: Would you like to add a new product to the file:
                    3: Would you like to remove a product from the file:
                    4: Would you like to get the highest price of all products:
                    5: Would you like to get the smallest price of all products:
                    E: Exit Program:
                    Please Type in a number to make your choice: 
                                    
                    """);
            choicesToPickOf();
        }

    }

    private static void choicesToPickOf() {
        String choice = in.nextLine();

        switch (choice) {
            case "1" -> menu.printProductInStock();
            case "2" -> menu.addProductsToList();
            case "3" -> menu.removeProductFromStock();
            case "4" -> menu.printProductsThatIsHighestPrice();
            case "5" -> menu.printProductThatIsLowestPrice();
            case "E", "e" -> menu.exitProgram();
        }
    }
}
