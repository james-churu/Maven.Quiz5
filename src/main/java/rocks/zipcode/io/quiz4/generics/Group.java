package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable{

    List<_> group;

    public Group() {
        this.group = new ArrayList();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return this.group.size();
    }

    public void insert(_ value) {
        this.group.add(value);
    }

    public Boolean has(_ value) {
        return this.group.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return this.group.get(indexOfValue);
    }

    public void delete(_ value) {
        this.group.remove(value);
    }

    public void clear() {
        this.group.clear();
    }

    public Iterator<_> iterator() {
        return group.iterator();
    }
    public String toString(){
        return this.group.toString();
    }
    public List<_> getGroup(){
        return this.group;
    }



    //************************************************
}
