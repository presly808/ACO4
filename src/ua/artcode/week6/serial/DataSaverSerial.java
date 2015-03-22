package ua.artcode.week6.serial;

import ua.artcode.week6.io.IOUtils;

import java.io.*;

/**
 * Created by serhii on 22.03.15.
 */
public class DataSaverSerial implements DataSaver {
    @Override
    public void save(String path, UserSerail userSerail) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(userSerail);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public UserSerail load(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(
                                        new FileInputStream(path))){
            UserSerail userSerail = (UserSerail) ois.readObject();
            return userSerail;
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
