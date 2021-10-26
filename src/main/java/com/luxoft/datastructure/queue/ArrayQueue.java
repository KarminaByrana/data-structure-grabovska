package com.luxoft.datastructure.queue;

public class ArrayQueue implements Queue {
    private int size;
    //Object [] arr = new Object [size] ;
    private Object[] arr = {"h", "j"};

    public ArrayQueue() {
        arr = new Object[10];
    }

    public ArrayQueue(int initialCapacity) {
        arr = new Object[initialCapacity];
    }

    @Override
    public void enqueue(Object value) {
        arr[size] = value;
        size++;

    }

    @Override
    public Object dequeue() {
        Object result = arr[0];
        Object[] newArr = new Object[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        size--;
        arr = newArr;
        return result;
    }

    @Override
    public Object peek() {
        return arr[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
