package menuFile;

import folderFile.FileManager;
import folderProducts.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MenuOptions {
    FileManager productStockFile;
    ArrayList<Product> productArrayList;
    Scanner in= new Scanner(System.in);
    public void startProgram(){
        productStockFile= new FileManager();
        productStockFile.fileReader();
        productArrayList= productStockFile.getProductData();
    }
    public void checkWhatIsInsideFile(){
        productStockFile.fileReader();
    }
    public void printProductInStock(){
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(i+1+": "+productArrayList.get(i));
        }
    }
    public void printProductThatIsLowestPrice(){
        productArrayList.sort(Comparator.comparingInt(Product::getPrice));
        printProductInStock();
    }
    public void printProductsThatIsHighestPrice(){
        productArrayList.sort(Comparator.comparingInt(Product::getPrice).reversed());
        printProductInStock();
    }
    public void removeProductFromStock(){
        System.out.println("What Item do you want to remove: ");
        printProductInStock();
        int productToRemove= in.nextInt();
        in.nextLine();
        if (productToRemove<=0){
            System.out.println("You can't remove nothing");
        }
        if (productToRemove>=1){
            productArrayList.remove(productToRemove-1);
            reAddIntoFile();

        }
    }

    private void reAddIntoFile() {
        try {
            BufferedWriter writer=  new BufferedWriter(new FileWriter("storeStorageFile.txt"));
            productStockFile.AddIntoFile(writer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addProductsToList(){
        System.out.println("Enter name: ");
        String name= in.nextLine();
        Product myProduct= productStockFile.getToAddProduct(name);
        productArrayList.add(myProduct);
        reAddIntoFile();

    }

    public void exitProgram(){
        System.exit(1);
    }
}
