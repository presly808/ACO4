package ua.artcode.week6.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by serhii on 21.03.15.
 */
public class TestFileOutputStream {

    public static final String PATH = "/home/serhii/IdeaProjects/ACO4/temp/out.txt";

    public static void main(String[] args) {

        OutputStream os = null;
        try {
            os = new FileOutputStream(PATH);
            String text = "test for output stream";
            byte[] arr = text.getBytes();
            os.write(arr);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
