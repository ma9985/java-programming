package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipCode;
    }

    public void setZipcode(String zipcode) {
        this.zipCode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + ", " +zipCode + ", " + country;
    }

    public void setCountry(String country) {
        this.country = country;


    }
}
