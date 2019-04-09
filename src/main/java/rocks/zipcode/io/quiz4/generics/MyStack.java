package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {

    private Stack<SomeType> someTypeStack;

    public MyStack() {
        someTypeStack = new Stack<>();
    }

    public Boolean isEmpty() {
        return someTypeStack.isEmpty();
    }

    public void push(SomeType i) {
        someTypeStack.push(i);
    }

    public SomeType peek() {
        if(isEmpty()) {
            return null;
        }
        return someTypeStack.peek();
    }

    public SomeType pop() {
        return someTypeStack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return someTypeStack.iterator();
    }
}
