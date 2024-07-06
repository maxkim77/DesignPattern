/*
빌더패턴은 객체생성의 복잡성을 줄이고, 가독성을 높이기위함
객체 생성과정과 표현하는 방법을 분리함으로써 동일한 생성절차에서 다른 표현결과를 만들 수 있는 디자인 패턴임.

1. 주 클래스 정의
주 클래스는 빌더 클래스를 통해서만 인스터화 가능
주 클래스의 생성자는 빌더 객체를 매개변수로 받아 속성 초기화

2. 빌더 클래스 정의
빌더 클래스는생성하려는 객체의 속성을 포함함.
각속성을 설정하는 메서드는 자신을 반환하여 메서드 체이닝을 가능하게 함.

3. 객체 생성과정
빌더클래스의 객체를 생성하고 체이닝 메서드를 사용하여 속성을 설정
빌드 메서드를 호출하여 person 객체를 생성

 */
// 주 클래스 정의
public class Person {
    // 주 클래스 필드 정의
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    // private 생성자를 정의
    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "person{"+ 
                "firstName='" + firstName +'\''+
                ", lastName='" + lastName + '\''+
                ", age=" + age +
                ", address='"  + address + '\''+                
                '}';
    }
// 내부 빌더 클래스 정의
    public static class PersonBuilder {
        //속성을 설정하는 메서드 정의
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        // 메서드 체이닝: 여러 메서드를 하나의 체인으로 연결하여, 객체의 여러속성을 설정하고, 마지막에 build를 호출해서 객체를 생성
        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public PersonBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
        // 객체를 생성하는 메서드 정의
    }
    
}
