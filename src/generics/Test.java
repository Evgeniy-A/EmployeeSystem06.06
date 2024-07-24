package generics;

public class Test {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Номер", 18);

        pair1.setFirstElement("Цифра");
    }
}
