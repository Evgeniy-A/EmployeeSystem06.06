package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader
                (new FileReader("text2.txt"));
             BufferedWriter writer = new BufferedWriter
                     (new FileWriter("text3.txt"))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

