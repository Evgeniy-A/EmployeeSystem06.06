package work_with_files;

import javax.print.attribute.standard.MediaSizeName;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

import static java.awt.Event.HOME;

public class FileWriterEx {
    public static void main(String[] args) {
        String str = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;\n";
        String s = "Привет!";

        try (FileWriter writer = new FileWriter("text2.txt",true)) {
            writer.write(str);
            writer.write(s);
            System.out.println("Выполнено");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}