package com.luxoft.datastructure.list;

import java.util.Arrays;

public class ArrayList implements List {
    private Object[] array;
    private int size;

    ArrayList() {
        array = new Object[10];
    }

    ArrayList(int capacity) {
        array = new Object[capacity];
    }

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
//        if ( value ) если значение null, выбросить ошибку
        array[index] = value;
        size++;
    }

    @Override
    public Object remove(int index) {
        Object deletedElement = array[index];
        for (int i = index - 1; i < array.length; i++) {
            array[i] = array[i + 1];

        }
        array[size] = null;
        size--;
        return deletedElement;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        return array[index] = value;
    }

    @Override
    public void clear() {
        size = 0;
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
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int indexOf(Object value) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                result = i;
            }
        }
        return result;
    }

    @Override
    public int lastIndexOf(Object value) {
        int result = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                result = i;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String string = "";
        StringBuilder builder = new StringBuilder(string);

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
        }
        return string;
    }
}
