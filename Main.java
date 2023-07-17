import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        System.out.println("i'm starting to create cars");
        Car firstCar = new Car("Ford", "Focus", "Red", 100);
        Car secondCar = new Car("Toyota", "Truck", "Grey", 120);
        //// שיעור 38!!!!!!
        System.out.println(String.format("Finished new car with type: %s, model: %s, colour: %s, speed: %s", firstCar.getType(), firstCar.getModel(), firstCar.getColour(), firstCar.getSpeed()));
        System.out.println(String.format("Finished new car with type: %s, model: %s, colour: %s, speed: %s", secondCar.getType(), secondCar.getModel(), secondCar.getColour(), secondCar.getSpeed()));

        /// cars array:
        Car[] carArray = new Car[]{firstCar, secondCar};

        for (Car car : carArray) {
            System.out.println("This is car type: " + car.getType());
        }
        Address myPersonAddress = new Address("Israel", "Haifa", "Wizman", 12);
        Person myPerson = new Person(1232, "Adi", "Katsir", "Adi Katsir", 31, myPersonAddress);

        System.out.println("this is " + myPerson.firstName);
        System.out.println(myPerson.address.country);
///lesson 39 super improtent!!!
//        myPerson.printPerson(myPerson);
        myPerson.printPersonData();

    ////lesson 41 - look at setters and getters, and encapsulation



    }
}
