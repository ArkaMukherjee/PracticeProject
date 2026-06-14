public class BuilderExample {
    public static void main(String[] args) {
        // Happy path
        Person p = new Person.Builder("Arka", "Mukherjee")
                .age(30)
                .address("Kolkata, India")
                .phone("0123456789")
                .build();
        System.out.println("Created: " + p);

        // Edge: missing required fields -> should throw at construction time
        try {
            new Person.Builder("", "Smith").build();
            System.err.println("ERROR: expected exception for empty firstName");
        } catch (IllegalArgumentException ex) {
            System.out.println("Expected failure for missing firstName: " + ex.getMessage());
        }

        // Edge: negative age -> should throw when setting age
        try {
            new Person.Builder("John", "Doe").age(-5).build();
            System.err.println("ERROR: expected exception for negative age");
        } catch (IllegalArgumentException ex) {
            System.out.println("Expected failure for negative age: " + ex.getMessage());
        }
    }
}

