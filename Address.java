public class Address {
    String country;
    String city;
    String street;
    int houseNumber;

    public Address(String country, String city, String street, int houseNumber){
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    public void printAddress(Address address){
        System.out.println("Adress country: " + address.country);
    }
}

