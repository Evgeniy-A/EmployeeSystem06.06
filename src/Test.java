import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List <String> str = new ArrayList<>(100);

        str.add("1");
        str.add("2");
        str.add(1,"1.5");
        str.add(2, "1.75");
        str.remove(0);
        str.set(1, "3");
        System.out.println(str);
        System.out.println(str.get(0));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List <Integer> list = new ArrayList<>(n);
        for (int i = 0; i < list.size(); i++) {
            

        }



    }
}