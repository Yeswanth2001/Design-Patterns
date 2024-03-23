### 1. What is Singleton Design Pattern?
- Singleton design pattern which comes under creational design pattern that ensure class has only one instance throughtout the application and that instance is globally accessed.
- Singleton pattern can also handle more load and high performance.

#### When to use Singleton Design Pattern?
- Class should only one instance.
- Logging
- Caching & configurations etc..

#### Advantage:
- Reduce memory
- Single instance
- Globally Accessed
- Lazy Initialization

### 2. What is Factory Design Pattern?
- The Factory Design Pattern which comes under creational design pattern used to create objects based on the client provided information.

#### Factory Design Pattern can be implemented in 3 ways:
- Simple Factory - Simple Factory Design Pattern acts like a manager that knows how to create different types of objects based on the client provided information. This way, the client code doesn't have to worry about how the objects are created.
  
- Factory Method - Factory method define an interface for creating object and let the subclass decide which class to instantiate. Object creation logic are encapsulated.
  
- Abstract Factory - It is extension of Factory Method pattern that provides an interface for creating families of related or dependent object without specifying their concrete class.

#### When to use Factory Design Pattern?
-  Centralize and encapsulate object creation logic.
-  Loose coupling and easy maintenance.

### 3. What is Builder Design Pattern?
- The Builder Design Pattern is a creational pattern which divides the construction of creating complex object and allowing to construct in different way, which makes easier to configure object.
- It is used when we have too many arguments to pass in Constructor & it's hard to maintain the order.
