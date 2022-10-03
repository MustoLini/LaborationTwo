package menuFile;

import folderFile.FileManager;
import folderProducts.Product;

import java.util.ArrayList;
import java.util.Comparator;

public class Menu {
    FileManager productStockFile= new FileManager();
    ArrayList<Product> productArrayList= productStockFile.getProductData();
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
}
