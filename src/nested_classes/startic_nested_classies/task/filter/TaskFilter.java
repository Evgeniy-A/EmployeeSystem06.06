package nested_classes.startic_nested_classies.task.filter;
import java.util.Scanner;

public class TaskFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        Filter filter = new Filter() {
            @Override
            public boolean accept(char c) {
                return Character.isDigit(c);
            }
        };
        System.out.println(filterString(line, filter));
    }

    public interface Filter {
        boolean accept(char c);
    }

    public static String filterString(String input, Filter filter) {
        StringBuilder str = new StringBuilder();
        char[] array = input.toCharArray();
        for (char c : array) {
            if (filter.accept(c)) {
                str.append(c);
            }
        }
        return str.toString();
    }
}