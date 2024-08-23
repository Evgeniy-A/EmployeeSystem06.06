package clone.company;

public class Test {
    public static void main(String[] args) {

        Company company1 = new Company("Искра", new Address("Москва"));

        Company company2 = new Company(company1);

        System.out.println(company2.getAddress().getCity());
    }
}
