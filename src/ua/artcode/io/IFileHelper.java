package ua.artcode.io;


import java.io.File;

public interface IFileHelper {

    File[] getFilesInDir(String path);
    String getFileContent(String path);
    void saveToFile(String path, String src);

    /**
     * @param dir serch start point
     * @param keyWord word for search
     *
     * @return paths of found files
     * */
    String[] findFiles(File dir, String keyWord);



}
