public class Main {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate(10);
        aggregate.addItem(1);
        aggregate.addItem(2);
        aggregate.addItem(3);

        Iterator iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
