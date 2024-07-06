public class Person {
// 1. 정적 멤버 변수로 유일한 인스턴스 선언
    private static Person instance;

// 2. 필드 정의 : 이름 , 성, 나이
    private String firstName;
    private String lastName;
    private int age;

// 3. private 생성자를 정의하여 외부에서 직접 인스턴스를 생성하지 못하게 함
    private Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
// 4. 싱글톤 인스턴스를 반환하는 정적 메서드를 정의
    public static Person getInstance(String firstName, String lastName, int age) {
        if (instance == null) {
            instance = new Person(firstName, lastName, age);
        }
        return instance;
    }


// 5. 소개 인스턴스 정의
    public void introduce() {
        System.out.println(("Hello, I'm"+firstName+""+lastName+", and"+age+"years old"));
    }
// 6. Getter Setter 
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public String toString() {
        return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        '}';
    }

}
