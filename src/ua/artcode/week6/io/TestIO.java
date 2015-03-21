package ua.artcode.week6.io;

/**
 * Created by serhii on 21.03.15.
 */
public class TestIO {

    public static final String PATH = "/home/serhii/IdeaProjects/ACO4/temp/out.txt";
//    public static final String PATH = "C:/Prog/";

    public static void main(String[] args) {
        IOUtils.writeInto(PATH, "Кирилиця і все ок");
        IOUtils.writeInto(PATH, "Кирилиця і все ок");
        IOUtils.writeInto(PATH, "Кирилиця і все ок");
        IOUtils.writeInto(PATH, "Кирилиця і все ок");

        String res = IOUtils.readFrom(PATH);
        System.out.println(res);
    }
}
