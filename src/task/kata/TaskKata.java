package task.kata;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(test(a, b));
    }


    public static String test(int a, int b) {
        if (a > b) {
            return "a > b";
        }
        if (b > a) {
            return "b > a";
        } else {
            return "числа равны";
        }
    }
}