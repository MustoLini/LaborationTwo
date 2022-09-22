package folderFile;

import folderProducts.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileService {


    private Scanner in = new Scanner(System.in);
    private String nameOfFile;

    private ArrayList<Product>productsInStore= new ArrayList<>();
    String s;
    private File file = new File("storeStorageFile.txt");
    public FileWriter createdFile() {


        FileWriter output = null;
        if (!file.exists() && !file.isDirectory()) {
            try {

                output = new FileWriter(file);
                System.out.println("How many products do you want to add to the Text File? ");
                int amountOfItemsAdded = in.nextInt();
                in.nextLine();

                for (int i = 0; i < amountOfItemsAdded; i++) {
                    System.out.println("What is the name of the product? ");
                    String name = in.nextLine();
                    output.write(name + ",");
                    System.out.println("What is the price of the product? ");
                    int price = in.nextInt();
                    in.nextLine();
                    output.write(price + ",");
                    System.out.println("What is the count of the product? ");
                    int count = in.nextInt();
                    in.nextLine();
                    output.write(count + ",");
                    System.out.println("What is the category of the product? ");
                    String category = in.nextLine();
                    output.write(category + ",");


                }

                output.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return output;
        } else {
            return null;
        }
    }
    public ArrayList<Product> productPlacement() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext() || scanner.hasNextLine()){
            String writer= scanner.next();
            String[] token= writer.split(",");
            for (int i = 0; i < token.length; i+=4) {
                System.out.println(token[i]);
                Product newProduct= new Product(token[i],Integer.parseInt(token[i+1]),Integer.parseInt(token[i+2]), token[i+3]);
                productsInStore.add(newProduct);
            }

        }
        return productsInStore;

    }

}