package be.isach.oopexercices.tp10.ex2;

public class LexiconItem<T> implements Comparable {

    private String label;
    private T value;
    private LexiconItem<T> next;

    public LexiconItem(String label, T value, LexiconItem<T> next) {
        this.label = label;
        this.next = next;
        this.value = value;
    }

    public LexiconItem(String label, T value) {
        this(label, value, null);
    }

    public void setNext(LexiconItem<T> next) {
        this.next = next;
    }

    public LexiconItem<T> getNext() {
        return next;
    }

    public String getLabel() {
        return label;
    }

    public T getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public int compareTo(Object o) {
        if(!(o instanceof LexiconItem)) return -1;

        LexiconItem<T> other = (LexiconItem<T>) o;
        return label.compareTo(other.label);
    }

    @Override
    public String toString() {
        return "LexiconItem{" +
                "label='" + label + '\'' +
                ", value=" + value +
                '}';
    }
}
