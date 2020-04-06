package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{

    List<String> strings;

    public SimpleStringGroup() {
        this.strings = new ArrayList<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return strings.size();
    }

    public void insert(String string) {
        this.strings.add(string);
    }

    public Boolean has(String string) {
        return strings.contains(string);
    }

    public String fetch(int indexOfValue) {
        return strings.get(indexOfValue);
    }

    public void delete(String string) {
        strings.remove(string);
    }

    public void clear() {
        strings.clear();
    }

    @Override
    public Iterator iterator() {
        return this.strings.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        strings.forEach(action);
    }
}
