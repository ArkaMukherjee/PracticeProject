public final class Person {
    private final String firstName;
    private final String lastName;
    private final int age; // -1 means unset
    private final String address;
    private final String phone;

    private Person(Builder b) {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.age = b.age;
        this.address = b.address;
        this.phone = b.phone;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age = -1;
        private String address = "";
        private String phone = "";

        /**
         * Builder requires firstName and lastName as required fields.
         */
        public Builder(String firstName, String lastName) {
            if (firstName == null || firstName.trim().isEmpty()) {
                throw new IllegalArgumentException("firstName is required");
            }
            if (lastName == null || lastName.trim().isEmpty()) {
                throw new IllegalArgumentException("lastName is required");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("age cannot be negative");
            }
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address == null ? "" : address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone == null ? "" : phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

