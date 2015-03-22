package ua.artcode.week6.serial;

/**
 * Created by serhii on 22.03.15.
 */
public class TestSerail {


    public static final String PATH =
            "/home/serhii/IdeaProjects/ACO4/temp/user.data";

    public static void main(String[] args) {

        UserSerail userSerail = new UserSerail(1, "Vasia", 1234);

        DataSaver dataSaver = new DataSaverSerial();

        dataSaver.save(PATH, userSerail);

        UserSerail deserial = dataSaver.load(PATH);
        System.out.println(deserial);
    }

}
