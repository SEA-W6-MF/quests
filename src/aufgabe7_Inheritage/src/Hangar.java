import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {

        // references to clio and queenElizabeth2
        Car clio = new Car("Clio");
        Boat queenElizabeth2 = new Boat("Queen Elizabeth 2");

        // displaying doStuff for each reference
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(clio);
        vehicles.add(queenElizabeth2);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.doStuff());
        }
    }
}