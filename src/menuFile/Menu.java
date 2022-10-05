package menuFile;

import folderFile.FileManager;
import folderProducts.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    FileManager productStockFile= new FileManager();
    ArrayList<Product> productArrayList= productStockFile.getProductData();
    Scanner in= new Scanner(System.in);
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
    public void RemoveProductFromStock(){
        int productToRemove= in.nextInt();
        in.nextLine();
        if (productToRemove<=0){
            System.out.println("You can't remove nothing");
        }
        if (productToRemove>=1){
            productArrayList.remove(productToRemove-1);
            try {
                BufferedWriter writer=  new BufferedWriter(new FileWriter("storeStorageFile.txt"));
                productStockFile.AddIntoFile(writer);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
