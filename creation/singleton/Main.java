public class Main {
    public static void main(String[] args) {
        Person person1 = Person.getInstance("John", "Doe", 28);
        Person person2 = Person.getInstance("Jane", "Doe", 30);

        if (person1==person2) {
            System.out.println("person1 and person2 are the same instance");
        } else {
            System.out.println("person1 and person2 are the different instance");
        }
        person1.introduce();
        person2.introduce();

        person2.setAge(28);
        person2.introduce();
    }
}
