package kata.oop.task1;

public class Pet {
    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat (Cat cat) {
            System.out.println("«Кошка поймана»");
            this.sayHello();
            cat.sayHello();
        }
    }

}
