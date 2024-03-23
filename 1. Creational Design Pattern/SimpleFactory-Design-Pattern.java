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

// VehicleFactory.java
// Factory class responsible for creating instances of vehicles
class VehicleFactory {
    public static Vehicle createCar() {
        return new Car();
    }

    public static Vehicle createMotorcycle() {
        return new Motorcycle();
    }
}

// Main.java
// Main class to test the VehicleFactory
public class Main {
    public static void main(String[] args) {
        // Creating a car
        Vehicle car = VehicleFactory.createCar();
        car.start();
        car.stop();

        // Creating a motorcycle
        Vehicle motorcycle = VehicleFactory.createMotorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}
