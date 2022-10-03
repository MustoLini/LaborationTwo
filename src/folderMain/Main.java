package folderMain;

import folderFile.FileManager;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileManager re= new FileManager();
        re.fileReader();

    }
}
