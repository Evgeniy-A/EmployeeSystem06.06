package task.kata;

interface Begin {
    void s ();
}

public class Test {

    class InnerTast {

    }
}
class Main1 {
    public static void main(String[] args) {
        Test obj1 = new Test();
        Test.InnerTast obj = obj1.new InnerTast();
        Begin s = new Begin() {
            @Override
            public void s() {

            }
        };
    }
}