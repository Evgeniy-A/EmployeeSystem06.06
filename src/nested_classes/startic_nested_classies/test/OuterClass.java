package nested_classes.startic_nested_classies.test;

public class OuterClass {
    private String line = "Приватное поле внешненгго класса";

    public void print(){

        class LocalClass {

            void print() {
                System.out.println();
            }

            void printLine() {
                System.out.println(line);
            }
        }


    }
}