package ua.artcode.io;


import java.io.File;
import java.io.FileNotFoundException;

public interface IFileHelper {

    File[] getFilesInDir(String path);
    String getFileContent(String path) throws FileNotFoundException;
    void saveToFile(String path, String src) throws FileNotFoundException;

    /**
     * @param dir serch start point
     * @param keyWord word for search
     *
     * @return paths of found files
     * */
    String[] findFiles(File dir, String keyWord);



}
