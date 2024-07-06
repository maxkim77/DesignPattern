// 빌더 객체생성 및 속성 설정
public class Main {
public static void main(String[] args){
    // 주 클래스 객체생성
    Person person = new Person.PersonBuilder()
            .setFirstName("John")
            .setLastName("Doe")
            .setAge(30)
            .setAddress("123 Main St")
            .build();
// 생성된 객체 출력
    System.out.println(person);    
    }
}