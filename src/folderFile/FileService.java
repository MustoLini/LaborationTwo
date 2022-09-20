package folderFile;

import java.io.*;
import java.util.Scanner;

public class FileService {


    Scanner in = new Scanner(System.in);
    private String nameOfFile;

    public PrintWriter createdFile() {

        File file = new File("storeStorageFile.txt");
        PrintWriter printWriterToFile= null;

        try {

            FileWriter output = new FileWriter(file);
            printWriterToFile = new PrintWriter(output.toString());
            System.out.println("How many products do you want to add to the Text File? ");
            int amountOfItemsAdded = in.nextInt();
            in.nextLine();

            for (int i = 0; i < amountOfItemsAdded; i++) {
                System.out.println("What is the name of the product? ");
                String name = in.nextLine();
                printWriterToFile.print(name + ",");
                System.out.println("What is the price of the product? ");
                int price = in.nextInt();
                in.nextLine();
                printWriterToFile.print(price + ",");
                System.out.println("What is the count of the product? ");
                int count = in.nextInt();
                in.nextLine();
                printWriterToFile.print(count + ",");
                System.out.println("What is the category of the product? ");
                String category = in.nextLine();
                printWriterToFile.print(category + ",");
                printWriterToFile.println();


            }
            printWriterToFile.close();
            output.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return printWriterToFile;
    }
}
