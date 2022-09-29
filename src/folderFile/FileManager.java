package folderFile;

import folderProducts.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    Scanner in= new Scanner(System.in);
    ArrayList<Product> productData= new ArrayList<>();
    BufferedReader reader;

    void fileReader() {
        {
            try {
                reader = new BufferedReader(new FileReader("storeStorageFile.txt"));
            } catch (FileNotFoundException e) {
                fileWriter();
            }
        }
    }
    void fileWriter(){
        try {
            BufferedWriter writer=  new BufferedWriter(new FileWriter("storeStorageFile.txt"));
            populateArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    String addIntoWriter(ArrayList<Product> productArrayList){
        String inData="";
        for (Product e: productArrayList) {
            inData+=e.getName()+","+ e.getPrice()+","+"\n";
        }
        return inData;
    }
    void populateArray(){

        boolean isRunning= true;

        while (isRunning){
            System.out.println("Enter name: ");
            String input= in.nextLine();
            if (input.equalsIgnoreCase("e")){
                isRunning=false;
            }
            else {
                Product myProduct= new Product(input,32,34,"vdvs");
                productData.add(myProduct);
            }

        }

    }

}