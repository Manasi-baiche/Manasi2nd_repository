package Filehandlingpkg;

import java.io.*;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is a file write example.");
            writer.close();

            // Reading from a file
            FileReader reader = new FileReader("sample.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
