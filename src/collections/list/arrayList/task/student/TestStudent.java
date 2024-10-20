package collections.list.arrayList.task.student;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Михил");
        Student student2 = new Student("Мария");
        Student student3 = new Student("Игорь");
        Student student4 = new Student("Вадим");
        List<Student> list = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println(list);

        if (!list.isEmpty()) {
            int index = list.indexOf(new Student("Студент", 2));
            list.remove(index);
            list.add(new Student("Ирина", index));
            System.out.println(list);
        }

        list.clear();
        System.out.println(list.size());
    }
}