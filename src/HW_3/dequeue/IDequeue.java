package HW_3.dequeue;

import HW_3.queue.QueueImpl;

public class IDequeue<E> extends QueueImpl<E> {
//В классе вызываются как метод insertLast так и метод insert, которые одинаковы.
// Как сделать, чтобы метод insert не вызывался из данного класса не придумал

    public IDequeue(int maxSize) {
        super(maxSize);
    }

    public boolean insertLast(E value) {
        return insert(value);
    }

    public boolean insertFirst(E value) {
        if (isFull()) {
            return false;
        }

        if (head == DEFAULT_HEAD) {
            head = data.length;
        }
        head--;
        data[head] = value;

        size++;
        return true;

    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }

        if (tail == DEFAULT_TAIL) {
            tail = data.length - 1;
        }

        E removedValue = data[tail];
        data[tail--] = null;
        size--;
        return removedValue;
    }

    public E removeFirst() {
        return remove();
    }
}
