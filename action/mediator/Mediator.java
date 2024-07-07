import java.util.ArrayList;
import java.util.List;

/* 객체가 서로 직접적으로 통신하지않고 Mediator 클래스를 통해서만 통신하는 것 */

// Mediator 인터페이스
interface Mediator {
    void sendMessage(String message, Colleague colleague);
    void addColleague(Colleague colleague);
}

// ConcreteMediator 클래스
class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            // 메시지를 보낸 Colleague가 아닌 경우에만 메시지 전송
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
}

// Colleague 추상 클래스
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.addColleague(this); // Mediator 를 통해서 colleague를 등록하는 부분
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}

// ConcreteColleague 클래스
class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Colleague1 sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague1 received message: " + message);
    }
}

class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Colleague2 sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague2 received message: " + message);
    }
}
