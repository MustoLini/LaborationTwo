package folderMain;

import folderFile.FileManager;
import folderProducts.Product;
import menuFile.Menu;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileManager re= new FileManager();
        re.fileReader();

        Menu menu= new Menu();
        menu.checkWhatIsInsideFile();
        menu.printProductInStock();
        menu.printProductThatIsLowestPrice();
        //System.out.println(re.getProductData());
        ArrayList<Product> productList= re.getProductData();
       // System.out.println(productList);
        int min=productList.get(0).getPrice();
        //Get the lowest price of the products.
        productList.sort(Comparator.comparingInt(Product::getPrice));
        productList.forEach(System.out::println);
       // System.out.println(productList.stream().min(Comparator.comparing(Product::getPrice)));
        //Get the lowest price of alla product and print them out;
        for (int i = 1; i < productList.size(); i++) {
            if (productList.get(i).getPrice() < min) {
                min = productList.get(i).getPrice();
            }
        }
        for (Product po:productList) {
       //     System.out.println(po);
        }
     //   System.out.println();



    }
}
