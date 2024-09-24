package nested_classes.startic_nested_classies.task;

public class LocalClassTask {
    public static void main(String[] args) {
        checkAge();
    }
        public static void checkAge() {
            class Person {
                private int age;

                public Person(int age) {
                    this.age = age;
                }

                public int getAge() {
                    return age;
                }

                public boolean isAdult() {
                    if (age >= 18) {
                        System.out.println("человек совершеннолетний");
                        return true;
                    }
                    System.out.println("человек не совершеннолетний");
                    return false;
                }
            }
            Person chel1 = new Person(14);
            chel1.isAdult();
        }
}