package ua.artcode.week6.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by serhii on 21.03.15.
 */
public class TestsInputFile {

    public static void main(String[] args) {
        try {
            InputStream is =
                    new FileInputStream("/home/serhii/IdeaProjects/ACO4/temp/text.txt");

            int read = is.read();
            while (read != -1){
                System.out.print((char)read);
                read = is.read();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("after exception");
    }

}
