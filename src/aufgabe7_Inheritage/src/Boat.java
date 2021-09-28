public class Boat extends Vehicle {

    // constructor
    public Boat(String brand) {
        super(brand);
    }

    // method
    @Override
    public String doStuff() {
        return "I'm " + getBrand() + " and I go glug glug!";
    }
}
