package lection3.lesson3.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new DataInputStream(new
                FileInputStream("C:\\Example\\jdk-cource_2\\src\\main\\java\\lection3\\lesson3\\task1\\test.txt"));
        FirstClass<String, DataInputStream, Integer> fc = new FirstClass<>("any",
                new DataInputStream(is), 1);

        fc.getNamesClass();
    }
}
