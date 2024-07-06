클래스 Person:
    속성 firstName
    속성 lastName
    속성 age
    속성 address

    생성자(firstName, lastName, age, address):
        속성 초기화:
            this.firstName = firstName
            this.lastName = lastName
            this.age = age
        
        메서드 clone():
            새로운 person 객체 생성
            새로운 객체의 속성을 현재객체의 속성으로 초기화
            새로운 객체 반환

        메서드 toString():
            객체의 속성을 문자열로 반환

클래스 Main:
    메서드 main():
        Person 객체 person1 생성 (firstName: "John", lastName: "Doe", age: 30, address: "123 Main St")
        Person 객체 person2 생성 (person1.clone() 호출)
        person2의 firstName 속성을 "Jane"으로 변경

        person1 출력
        person2 출력
        