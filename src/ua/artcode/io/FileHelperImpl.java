package ua.artcode.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by serhii on 29.03.15.
 */
public class FileHelperImpl implements IFileHelper {
    @Override
    public File[] getFilesInDir(String path) {
        return new File[0];
    }

    @Override
    public String getFileContent(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        String res = "";

        while(sc.hasNextLine()){
            res += sc.nextLine() + "\n";
        }

        return res;
    }

    @Override
    public void saveToFile(String path, String src) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(path);
        pw.println(src);
        pw.close();
        pw.close();
    }

    @Override
    public String[] findFiles(File dir, String keyWord) {
        return new String[0];
    }
}
