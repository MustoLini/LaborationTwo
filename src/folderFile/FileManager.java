package folderFile;

import folderProducts.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    Scanner in= new Scanner(System.in);
    private ArrayList<Product> productData= new ArrayList<>();
    BufferedReader reader;

    String[]strings;
    String inData="";
    int idCount=1;

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
            for (int i = 0; i < strings.length; i+=5) {
                //System.out.println(strings[i]);
                productData.add(i,new Product(Integer.parseInt(strings[i]),strings[i+1],Integer.parseInt(strings[i+2]),Integer.parseInt(strings[i+3]),strings[i+4]));
            }
        }

    }

    public void fileWriter(){
        try {
            BufferedWriter writer=  new BufferedWriter(new FileWriter("storeStorageFile.txt"));
            populateArray();
            AddIntoFile(writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void AddIntoFile(BufferedWriter writer) throws IOException {
        writer.write(addIntoWriter(productData));
        writer.close();
    }


    public String addIntoWriter(ArrayList<Product> productArrayList){
        inData="";
        for (Product e : productArrayList) {
            if (!productArrayList.contains(e)){
            e.setId(idCount++);}
            inData += e.getId() + "," + e.getName() + "," + e.getPrice() + "," + e.getCount() + "," + e.getCategory() + "," + "\n";
        }
        //System.out.println(inData);
        return inData;
    }

    public void populateArray(){

        boolean isRunning= true;

        while (isRunning){
            System.out.println("Enter Product name: ");
            String name= in.nextLine();
            if (name.equalsIgnoreCase("e")){
                isRunning=false;
            }
            else {
                Product myProduct = getToAddProduct(name);
                productData.add(myProduct);
            }

        }

    }

    public Product getToAddProduct(String name) {
        System.out.println("Enter Product price: ");
        int price= in.nextInt();
        in.nextLine();
        System.out.println("Enter the count of the product: ");
        int count= in.nextInt();
        in.nextLine();
        System.out.println("Enter the Category this product is in: ");
        String category= in.nextLine();
        Product myProduct= new Product(idCount,name,price,count,category);
        return myProduct;
    }


    public ArrayList<Product> getProductData() {
        return productData;
    }
}
