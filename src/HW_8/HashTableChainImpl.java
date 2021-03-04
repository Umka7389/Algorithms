package HW_8;

import java.util.LinkedList;

public class HashTableChainImpl<K, V> implements HashTable<K, V> {

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }
    }

    private LinkedList<Item<K, V>>[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTableChainImpl(int maxSize) {
        this.data = new LinkedList[maxSize * 2];
        init(maxSize * 2, this.data);
    }

    private int hashFunc(K key) {
        return key.hashCode() % data.length;
    }

    private void init(int maxsize, LinkedList<Item<K, V>>[] data) {
        for (int i = 0; i < maxsize; i++) {
            data[i] = new LinkedList<>();
        }
    }

    @Override
    public boolean put(K key, V value) {
        int index = hashFunc(key);
        LinkedList<Item<K, V>> chain = data[index];
        if (!chain.isEmpty()) {
            for (Item<K, V> item : chain) {
                if (item.getKey().equals(key)) {
                    item.setValue(value);
                    return true;
                }
            }
        }
        chain.push(new Item<>(key, value));
        size++;
        return true;
    }


    @Override
    public V get(K key) {
        int index = hashFunc(key);
        LinkedList<Item<K, V>> chain = data[index];
        for (Item<K, V> item : chain) {
            if (item.getKey().equals(key)) {
                return item.getValue();
            }
        }
        return null;
    }


    @Override
    public V remove(K key) {
        int index = hashFunc(key);
        if (index == -1) {
            return null;
        }

        Item<K, V> returnItem;
        LinkedList<Item<K, V>> chain = data[index];
        for (Item<K, V> item : chain) {
            if (item.getKey().equals(key)) {
                returnItem = item;
                chain.remove(item);
                size--;
                return returnItem.getValue();
            }
        }
        return null;
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
    public void display() {
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = [%s]", i, data[i]);
            System.out.println();
        }
        System.out.println("----------");
    }
}
