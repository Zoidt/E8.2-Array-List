/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

package collections.list;

/**
 * An implementation of the List interface using an array.
 *
 * @author Ian Clement
 */
public class ArrayList<T> implements List<T> {

    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private T[] elements;
    private int size;

    private int moveElementCounter;
    private int expandCounter;
    private int expandMoveElementCounter;

    // Stores the index of the array traversal.
    private int cursor;

    public ArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
        size = 0;
        moveElementCounter = 0;
    }

    private void shift(int position) {
        // shift the array upwards to make a new position
        for(int i = size; i > position; i--, moveElementCounter++)
            elements[i] = elements[i-1];
    }

    private void unshift(int position) {
        // shift the array downwards over the remove positon.
        for(int i=position; i<size-1; i++, moveElementCounter++)
            elements[i] = elements[i+1];

        // nullify the removed reference
        elements[size-1] = null;
    }

    /**
     * Checks for the need to expand the elements array and if necessary:
     *  - allocates a new array with new size
     *  - copies the current data from the previous elements into the new array
     */
    private void checkCapacityAndExpand() {

    }

    // Stats

    public int getMoveElementCounter() {
        return moveElementCounter;
    }

    public int getAmountOfSpaceRemaining() {
        return elements.length - size;
    }

    public int getExpandCounter() {
        return expandCounter;
    }

    public int getExpandMoveElementCounter() {
        return expandMoveElementCounter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<size; i++) {
            sb.append(elements[i]);
            if(i < size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    @Override
    public void reset() {
        
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public void add(int position, T element) {

    }

    @Override
    public T remove(int position) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int position) {
        return null;
    }

    @Override
    public T set(int position, T element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
