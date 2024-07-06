// Address 객체

public class Address {
    // 변수 선언부
    private String street;
    private String city;
    private String state;
    // Address 객체 생성부
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
    // 문자열 변환 구간
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}