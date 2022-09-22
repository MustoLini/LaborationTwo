package folderFile;

import java.io.*;
import java.util.Scanner;

public class FileService {


    Scanner in = new Scanner(System.in);
    private String nameOfFile;

    public FileWriter createdFile() {

        File file = new File("storeStorageFile.txt");
        FileWriter output = null;
        if (!file.exists()&& !file.isDirectory()) {
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
                    output.write("\n");


                }

                output.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return output;
        }
        else {
            return null;
        }
    }
}
