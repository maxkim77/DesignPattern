// Person 객체
public class Person {
    // 변수 선언부
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    // Person 객체 생성부
    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    // 문자열 변환 구간
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

