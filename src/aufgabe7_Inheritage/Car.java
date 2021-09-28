package aufgabe7_Inheritage;

public class Car extends Vehicle {

    // constructor
    public Car(String brand) {
        super(brand);
    }

    // method
    @Override
    public String doStuff() {
        return ("I'm " + getBrand() + " and I go zoom zoom zoom!");
    }
}

