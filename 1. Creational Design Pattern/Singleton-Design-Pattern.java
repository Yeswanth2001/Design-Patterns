/** To create a private constructor in a class to retrict the instantiation from outside the class.
1. Private Constructor: Ensure that the class has a private constructor to prevent instantiation from outside the class.
2. Static Instance: Create a priavte static variable to store the single instance of the class.
3. Static Method: Create a static method that returns the instance of the class.
**/

public class Singleton {
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation outside the class
    private Singleton() {
        // Initialization code, if any
    }

    // Double-check locking for thread safety
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Other methods and properties of the singleton
}
