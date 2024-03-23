class Person {
    private final String name;
    private final int age;
    private final String address;

    private Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    static class PersonBuilder {
        private String name;
        private int age;
        private String address;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            // Validate parameters
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty.");
            }
            if (age <= 0) {
                throw new IllegalArgumentException("Age must be a positive integer.");
            }
            // Optionally, validate address parameter

            return new Person(name, age, address);
        }
    }

    // Static factory method
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                            .setName("John")
                            .setAge(30)
                            .setAddress("123 Main St")
                            .build();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
