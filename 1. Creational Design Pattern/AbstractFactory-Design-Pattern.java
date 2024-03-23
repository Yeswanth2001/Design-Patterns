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
// Abstract factory interface for creating families of related vehicle objects
interface VehicleFactory {
    Vehicle createCar();
    Vehicle createMotorcycle();
}

// VehicleFactoryImpl.java
// Concrete factory implementation for creating cars and motorcycles
class VehicleFactoryImpl implements VehicleFactory {
    @Override
    public Vehicle createCar() {
        return new Car();
    }

    @Override
    public Vehicle createMotorcycle() {
        return new Motorcycle();
    }
}

// Main.java
// Main class to test the Abstract Factory pattern
public class Main {
    public static void main(String[] args) {
        // Creating a car and a motorcycle using VehicleFactoryImpl
        VehicleFactory factory = new VehicleFactoryImpl();
        Vehicle car = factory.createCar();
        Vehicle motorcycle = factory.createMotorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}
