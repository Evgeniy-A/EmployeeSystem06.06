package nested_classes.startic_nested_classies.task;

import clone.person.Person;

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
                return age >= 18;
            }
        }
        Person person1 = new Person(14);
        if (person1.isAdult()) {
            System.out.println("Человек совершеннолетний");
        }
        else System.out.println("Человек несовершеннолетний");
    }
}
