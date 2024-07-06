public class Main {
    public static void main(String[] args){
        PersonFactory factory = new ConcretePersonFactory();

        Person person1 = factory.createPerson("John", "Doe", 30, "123");
        Person person2 = factory.createPerson("Jane", "Doe", 28, "123");
        System.out.println(person1);
        System.out.println(person2);
    }
}
