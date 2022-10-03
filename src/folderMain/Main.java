package folderMain;

import folderFile.FileManager;
import menuFile.Menu;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileManager re= new FileManager();
        re.fileReader();
        System.out.println(re.getProductData());

    }
}
