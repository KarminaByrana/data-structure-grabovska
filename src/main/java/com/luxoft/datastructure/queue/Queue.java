package com.luxoft.datastructure.queue;

public interface Queue {
    void enqueue(Object value); // добавляет в очередь

    Object dequeue(); // удаляет из очереди

    Object peek(); // какое значение выйдет следующим?

    int size(); // на сколько большая очередь?

    boolean isEmpty(); // есть ли в массиве значения?

    boolean contains(Object value); // содержит массив переданное значение?

    void clear(); // очищает полностью очередь

    String toString(); // [A, B, C] if size = 3
}
