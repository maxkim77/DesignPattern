public class KoreanPersonFactory implements PersonFactory {
    @Override
    public Person createPerson(){
        return new Person("홍", "길동", 30, new Address("강남대로", "서울", "서울특별시"));
    }
    @Override
    public Address createAddress() {
        return new Address("강남대로", "서울", "서울특별시");
    }
}

