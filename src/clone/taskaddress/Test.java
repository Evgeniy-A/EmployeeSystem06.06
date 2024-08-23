package clone.taskaddress;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{

        Address address1 = new Address("Екатеринбург", 96);
        Address address2 = new Address(address1);
        Address address3 = address2.clone();

        System.out.println(address2.getZipCode());
        System.out.println(address3.getCity());
    }
}
