package menuFile;

import folderFile.FileManager;
import folderProducts.Product;

import java.util.ArrayList;

public class Menu {
    public void printProductInStock(){
        FileManager productStockFile= new FileManager();
        ArrayList<Product> productArrayList= new ArrayList<>(productStockFile.getProductData());

        for (Product in: productArrayList) {
            System.out.println(in);

        }

    }
}
