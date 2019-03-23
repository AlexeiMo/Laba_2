package sample;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class Computer {
    public Deque<Program> st;
    public Computer()
    {
        st = new Deque<Program>() {
            @Override
            public void addFirst(Program program) {

            }

            @Override
            public void addLast(Program program) {

            }

            @Override
            public boolean offerFirst(Program program) {
                return false;
            }

            @Override
            public boolean offerLast(Program program) {
                return false;
            }

            @Override
            public Program removeFirst() {
                return null;
            }

            @Override
            public Program removeLast() {
                return null;
            }

            @Override
            public Program pollFirst() {
                return null;
            }

            @Override
            public Program pollLast() {
                return null;
            }

            @Override
            public Program getFirst() {
                return null;
            }

            @Override
            public Program getLast() {
                return null;
            }

            @Override
            public Program peekFirst() {
                return null;
            }

            @Override
            public Program peekLast() {
                return null;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(Program program) {
                return false;
            }

            @Override
            public boolean offer(Program program) {
                return false;
            }

            @Override
            public Program remove() {
                return null;
            }

            @Override
            public Program poll() {
                return null;
            }

            @Override
            public Program element() {
                return null;
            }

            @Override
            public Program peek() {
                return null;
            }

            @Override
            public void push(Program program) {

            }

            @Override
            public Program pop() {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public Iterator<Program> iterator() {
                return null;
            }

            @Override
            public Iterator<Program> descendingIterator() {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Program> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
    public void addProgram(Program p) {
        st.push(p);
    }
    public void deleteProgram() {
        st.pop();
    }
}

