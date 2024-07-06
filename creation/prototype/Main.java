public class Main {
    public static void main(String[] args){
        // Person 객체 생성
        Person person1 = new Person("John", "Doe", 30, "Main Str.");
        //Person 객체 복사
        Person person2 = person1.clone();
        person2.setFirstName("jane");
        
        System.out.println(person1);
        System.out.println(person2);
    }
    
}
