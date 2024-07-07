public class ConcreteIterator implements Iterator {
    private final Object[] items;
    private int index;

    public ConcreteIterator(Object[] items) {
        this.items=items;
        this.index=0;
    }    

    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            throw new IllegalStateException("Error");
        }
        return items[index++];
    }
}
