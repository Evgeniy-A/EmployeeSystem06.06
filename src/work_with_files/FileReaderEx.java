package work_with_files;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("text2.txt")){
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
            System.out.println("Выполнено");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

