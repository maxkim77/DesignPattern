
public class Client {
    public static void main(String[] args) {
        PersonFactory koreanFactory = new KoreanPersonFactory();
        Person koreanPerson = koreanFactory.createPerson();
        Address koreanAddress = koreanFactory.createAddress();

        System.out.println("Korean Person:" + koreanPerson);
        System.out.println("Korean Address:" + koreanAddress);
        // 미국인 Person 생성
        PersonFactory americanFactory = new AmericanPersonFactory();
        Person americanPerson = americanFactory.createPerson();
        Address americanAddress = americanFactory.createAddress();  
        System.out.println("American Person: " + americanPerson);
        System.out.println("American Address: " + americanAddress);
    }
}
