public class ConcretePerson implements Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public ConcretePerson(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = firstName;
        this.age = age;
        this.address = address;
    }

        @Override
    public String getFirstName() {
        return firstName;
    }


    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ConcretePerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
