package clone.person;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Иван", 30);
        Person person2 = person1.clone();

        System.out.println(person2.getName());

    }
}
