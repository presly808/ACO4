package ua.artcode.week6.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by serhii on 21.03.15.
 */
public class IOUtils {

    // have some problems
    public static void writeInto(String path, String src){

        //try with resources
        try (FileWriter fw = new FileWriter(path, true)){
            fw.write(src+"\n");
        }catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String readFrom(String path){
        String res = "";
        char[] buff = new char[1024];

        try {
            FileReader fileReader = new FileReader(path);

            int count = 0;
            while ((count = fileReader.read(buff)) != -1){
                res += new String(buff, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res;
    }


}
