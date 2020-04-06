package rocks.zipcode.io.quiz4.generics;

import com.oracle.javafx.jmx.json.impl.JSONMessages;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {

    Stack<SomeType> stack;

    public MyStack() {
        this.stack = new Stack();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void push(SomeType i) {
        this.stack.push(i);
    }

    public SomeType peek() {
        if(isEmpty()){
            return null;
        }else{
            return this.stack.peek();
        }

        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {
        return this.stack.pop();
    }


    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {

    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return null;
    }
}
