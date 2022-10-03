package folderFile;

import folderProducts.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    Scanner in= new Scanner(System.in);
    private ArrayList<Product> productData= new ArrayList<>();
    BufferedReader reader;
    String[]strings;
    String inData="";

    public void fileReader() {
        {
            try {
                reader = new BufferedReader(new FileReader("storeStorageFile.txt"));
                addProductFromFileIntoArray();


            } catch (Exception e) {
                fileWriter();
            }
        }
    }

    private void addProductFromFileIntoArray() throws IOException {
        String line;
        while ((line = reader.readLine())!=null){
            strings=line.split(",");
            for (int i = 0; i < strings.length; i+=4) {
                System.out.println(strings[i]);
                productData.add(i,new Product(strings[i],Integer.parseInt(strings[i+1]),Integer.parseInt(strings[i+2]),strings[i+3]));
            }
        }

    }

    public void fileWriter(){
        try {
            BufferedWriter writer=  new BufferedWriter(new FileWriter("storeStorageFile.txt"));
            populateArray();
            writer.write(addIntoWriter(productData));
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String addIntoWriter(ArrayList<Product> productArrayList){
        inData="";
        for (Product e: productArrayList) {
            inData+=e.getName()+","+ e.getPrice()+","+e.getCount()+","+e.getCategory()+","+"\n";
        }
        System.out.println(inData);
        return inData;
    }

    public void populateArray(){

        boolean isRunning= true;

        while (isRunning){
            System.out.println("Enter name: ");
            String name= in.nextLine();
            if (name.equalsIgnoreCase("e")){
                isRunning=false;
            }
            else {
                System.out.println("Enter price: ");
                int price= in.nextInt();
                in.nextLine();
                System.out.println("Enter the count of the product: ");
                int count= in.nextInt();
                in.nextLine();
                System.out.println("Enter the Category this product is in: ");
                String category= in.nextLine();
                Product myProduct= new Product(name,price,count,category);
                productData.add(myProduct);
            }

        }

    }


    public ArrayList<Product> getProductData() {
        return productData;
    }
}
