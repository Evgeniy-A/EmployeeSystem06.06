package clone.company;

public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public Address (Address cloningaddress){
        this(cloningaddress.city);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
