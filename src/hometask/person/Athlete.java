package hometask.person;

public class Athlete extends Person {

    public Athlete() {
    }

    @Override
    public String eat() {
        return "Необходимо 2500 ккал";
    }
    public String exercises(){
        return "Необходимо 9 часов сна";
    }
}
