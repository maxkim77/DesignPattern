// 추상 클래스 정의
abstract class Beverage {

    // 템플릿 메서드
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    // 공통적으로 사용 되는 메서드
    void boilWater() {
        System.out.println("Boiling Water");
    }
    void pourInCup() {
        System.out.println("");
    }

    // 하위 클래스에서 구현해야할 추상 메서드

    abstract void brew();
    abstract void addCondiments();
}

// 커피 클래스

class Coffee extends Beverage {
    void brew() {
        System.out.println("Dripping Coffee");
    }
    void addCondiments(){
        System.out.println("Adding sugar");
    }
}

class Tea extends Beverage {
    void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("adding lemon");
    }
}