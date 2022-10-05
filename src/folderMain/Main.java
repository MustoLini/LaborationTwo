package folderMain;

import folderFile.FileManager;
import menuFile.MenuOptions;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileManager re= new FileManager();
        re.fileReader();

        MenuOptions menu= new MenuOptions();
        menu.checkWhatIsInsideFile();

        menu.printProductThatIsLowestPrice();
        menu.printProductsThatIsHighestPrice();
        menu.printProductInStock();
        menu.removeProductFromStock();
        menu.addProductsToList();
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
}
