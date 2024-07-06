public class ConcretePersonFactory extends PersonFactory {
    @Override
    public Person createPerson(String firstName, String lastName, int age, String address){
        return new ConcretePerson(firstName, lastName, age, address);
    }
}
