package folderMain;

import folderFile.FileService;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileService ne= new FileService();
        ne.createdFile();

    }
}
