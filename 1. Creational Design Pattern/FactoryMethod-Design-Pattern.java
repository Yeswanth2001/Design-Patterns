// Vehicle.java
// Interface for all types of vehicles
interface Vehicle {
    void start();
    void stop();
}

// Car.java
// Concrete implementation of Vehicle for cars
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

// Motorcycle.java
// Concrete implementation of Vehicle for motorcycles
class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

// VehicleCreator.java
// Abstract class defining the factory method
abstract class VehicleCreator {
    // Factory method to create vehicles
    public abstract Vehicle createVehicle();
}

// CarCreator.java
// Concrete subclass for creating cars
class CarCreator extends VehicleCreator {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

// MotorcycleCreator.java
// Concrete subclass for creating motorcycles
class MotorcycleCreator extends VehicleCreator {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

// Main.java
// Main class to test the Factory Method pattern
public class Main {
    public static void main(String[] args) {
        // Creating a car using CarCreator
        VehicleCreator carCreator = new CarCreator();
        Vehicle car = carCreator.createVehicle();
        car.start();
        car.stop();

        // Creating a motorcycle using MotorcycleCreator
        VehicleCreator motorcycleCreator = new MotorcycleCreator();
        Vehicle motorcycle = motorcycleCreator.createVehicle();
        motorcycle.start();
        motorcycle.stop();
    }
}
