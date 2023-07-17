public class Person {
    long id;
    String firstName;
    String lastName;
    String fullName;
    int age;
    Address address;

    public Person(long id, String firstName, String lastName, int age, Address address){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.fullName = firstName + " " + lastName;
    }

    public Person(long id, String firstName, String lastName, String fullName, int age, Address address){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

//    public void printPerson(Person person){
//        System.out.println("Person id: " + person.id);
//        person.address.printAddress(person.address);
            ////up here is a valid method, the calling for it in the main is also valid but nerfed for the sake of the second one
        //alternatvily, you can make function like this:

        public void printPersonData(){
            System.out.println("Person id: " + this.id);
            this.address.printAddress(this.address);
    }
}
