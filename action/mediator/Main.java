public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        colleague1.sendMessage("Hello from Colleague1");
        colleague2.sendMessage("Hello from Colleague2");
    }
}
