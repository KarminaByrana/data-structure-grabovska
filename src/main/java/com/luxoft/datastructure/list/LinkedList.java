package com.luxoft.datastructure.list;

import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;


    public Object peek() {
        Object result = head.value;
        return result;
    }

    public Node getNodeByIndex(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = this.tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(Object value, int index) {
        Objects.checkIndex(index, size + 1);
        Node newNode = new Node(value);
        if (head == null) {
            head = this.tail = newNode;
        } else if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (index == size) {
            tail.next = newNode;
            tail = newNode;
        } else {
            Node prev = getNodeByIndex(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    @Override
    public Object remove(int index) {
        Objects.checkIndex(index, size);
        Object removedValue;
        if (index == 0) {
            removedValue = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node prev = getNodeByIndex(index - 1);
            removedValue = prev.value;
            prev.next = prev.next.next;
            if (index == size - 1) {
                tail = prev;
            }
        }
        size--;
        return removedValue;
    }

    @Override
    public Object get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).value;
    }


    public Object getFirst() {
       if (isEmpty()) {
           throw new NoSuchElementException();
       }
        return get (0);
    }


    public Object getLast() {

        return get(size-1);
    }

    @Override
    public Object set(Object value, int index) { // изменения элементов
        Objects.checkIndex(index, size + 1);
        Node currentNode = getNodeByIndex(index);
        currentNode.value = value;
        return currentNode;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 || head == null;
    }

    @Override
    public boolean contains(Object value) {

        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(Object value) {
        int result = -1;
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(value)) {
                result = i;
            }
            current = current.next;
        }
        return result;
    }

    @Override
    public int lastIndexOf(Object value) {
        int result = -1;
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(value)) {
                result = i;
            }
            current = current.next;
        }
        return result;
    }
}
