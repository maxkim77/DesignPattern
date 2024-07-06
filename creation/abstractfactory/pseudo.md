# 1. 추상팩토리 인터페이스 정의

// 추상팩토리 인터페이스

interface PersonFactory {
    method createPerson(): Person
    method createAddress(): Address
}


# 2. 구체적인 팩토리 클래스들 구현

// 한국 제품 팩토리

class KoreanPersonFactory implements PersonFactory {
    method createPerson(): Person {
        return new Person("홍", "길동", 30, new Address("강남대로", "서울", "서울특별시"))
    }

    method createAddress(): Address {
        return new Address("강남대로", "서울", "서울특별시")
    }
}
// 미국 제품 팩토리
class AmericanPersonFactory implements PersonFactory {
    method createPerson(): Person {
        return new Person("John", "Doe", 25, new Address("123 Main St", "New York", "NY"))
    }

    method createAddress(): Address {
        return new Address("123 Main St", "New York", "NY")
    }
}


# 메인코드

// 클라이언트 코드
class Client {
    method main() {
        // 한국인 Person 생성
        PersonFactory koreanFactory = new KoreanPersonFactory()
        Person koreanPerson = koreanFactory.createPerson()
        Address koreanAddress = koreanFactory.createAddress()

        print("Korean Person: " + koreanPerson.toString())
        print("Korean Address: " + koreanAddress.toString())

        // 미국인 Person 생성
        PersonFactory americanFactory = new AmericanPersonFactory()
        Person americanPerson = americanFactory.createPerson()
        Address americanAddress = americanFactory.createAddress()

        print("American Person: " + americanPerson.toString())
        print("American Address: " + americanAddress.toString())
    }
}
