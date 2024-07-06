public class AmericanPersonFactory implements PersonFactory {
    @Override
    public Person createPerson() {
        return new Person("John", "Doe", 25, new Address("123 Main St", "New York", "NY"));
    }

    @Override
    public Address createAddress() {
        return new Address("123 Main St", "New York", "NY");
    }
}