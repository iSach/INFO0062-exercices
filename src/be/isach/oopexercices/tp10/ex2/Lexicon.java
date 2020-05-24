package be.isach.oopexercices.tp10.ex2;

public class Lexicon<T> {

    private LexiconItem<T> head;

    public Lexicon() {
        this.head = null;
    }

    public void add(String label, T value) {
        LexiconItem<T> newItem = new LexiconItem<>(label, value);
        if (head == null) {
            head = newItem;
        } else {
            LexiconItem<T> curr = head, prev = null;
            while (curr != null
                    && curr.compareTo(newItem) < 0) {
                prev = curr;
                curr = curr.getNext();
            }
            if(prev != null)
                prev.setNext(newItem);
            else
                head = newItem;
            newItem.setNext(curr);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LexiconItem<T> item = head;
        while (item != null) {
            sb.append(item).append("\n");
            item = item.getNext();
        }
        return sb.toString();
    }
}
