package work_with_files;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("text1.txt");
        File file2 = new File("C:\\Users\\HOME\\Desktop");
        System.out.println("Путь файла" + file.getAbsolutePath());
        System.out.println("----------------------------------");
        System.out.println(file.isAbsolute());
        System.out.println("----------------------------------");
        System.out.println(file.isDirectory());
        System.out.println("----------------------------------");
        System.out.println(file.exists());
        System.out.println("----------------------------------");
        
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");



    }
}