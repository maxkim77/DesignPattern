public class Person implements Cloneable {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    // 속성을 초기화하는 구간
    public Person(String firstName, String lastName, int age, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    // Getter와 Setter 메서드 추가
    // 객체의 속성값을 반환하거나 변경하는 메서드
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(int age){
        this.age = age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // 기존 객체를 복제하는 구간
    //cloneNotSuppoortedException e 는 기
    // 
    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) { //기존 객체가 clonable 인터페이스 구현 하지않은체 복제하려는 경우 예외처리
            e.printStackTrace(); // 예외처리구문 출력
            return null;
        }
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    
}
