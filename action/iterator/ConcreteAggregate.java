public class ConcreteAggregate implements Aggregate {

    private final Object[] items;
    private int size = 0;

    public ConcreteAggregate(int maxSize) {
        items = new Object[maxSize];
    }

    public void addItem(Object item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }

}
