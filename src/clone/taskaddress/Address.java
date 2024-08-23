package clone.taskaddress;

public class Address implements Cloneable{
    private String city;
    private int zipCode;

    public Address(String city, int zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(Address address){
        this.city = address.city;
        this.zipCode = address.zipCode;
    }

    public Address clone() throws CloneNotSupportedException{
        return (Address) super.clone();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }


}
