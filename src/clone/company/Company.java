package clone.company;

public class Company {
    private String name;
    private Address address;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Company(Company cloningcompany){
        this(cloningcompany.name, new Address(cloningcompany.address));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
