package packForHashMap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap<K, V> implements Map<K, V> {
    public Node<K, V>[] nodes;
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private int bucketCounter;
    public int size;

    public HashMap() {
        nodes = new Node[INITIAL_CAPACITY];
    }

    public HashMap(int capacity) {
        if (capacity<0){
            throw new IllegalArgumentException("Wrong capacity." + capacity);
        }
        nodes = new Node[capacity];

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return nodes == null;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) != null;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node<K, V> node : nodes) {
            Node<K, V> headNode = node;
            if (headNode.getValue().equals(value)) {
                return true;
            }
            while (headNode.getNextNode() != null) {
                headNode = headNode.getNextNode();
                if (headNode.getValue().equals(value)) {
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        Node<K, V> newNode = new Node(key, null);
        int hash = getHash(newNode);
        Node<K, V> currentNode = nodes[hash];
        while (currentNode != null) {

            if (currentNode.getKey().equals(newNode.getKey())) {
                break;
            }

            currentNode = currentNode.getNextNode();
        }
        if (currentNode == null) {
            throw new IllegalArgumentException("Nonexistent key, try again with another key");
        }
        return currentNode.getValue();
    }

    private boolean isFull() {
        return bucketCounter > size * 0.7;
    }

    private void increaseCapacity() {
        size = 0;
        bucketCounter = 0;
        Node<K, V>[] oldNodes = nodes;
        size = oldNodes.length * 2;
        nodes = new Node[size];
        for (int i = 0; i < oldNodes.length; i++) {
            if (oldNodes[i] != null) {
                put(oldNodes[i].getKey(), oldNodes[i].getValue());
            }

        }
    }

    private int getHash(Node<K, V> newNode) {
        return Math.abs(newNode.hashCode() % bucketCounter);
    }

    @Override
    public V put(K key, V value) {

        if (isFull()) {
            increaseCapacity();
        }

        Node<K, V> newNode = new Node<>(key, value);


        int hash = getHash(newNode);
        if (nodes[hash] == null) {
            nodes[hash] = newNode;
            size++;
            bucketCounter++;
        }
        Node<K, V> currentNode = nodes[hash];
        while (currentNode != null) {

            if (currentNode.getKey().equals(newNode.getKey())) {
                currentNode.setValue(newNode.getValue());
                break;
            } else if (currentNode.getNextNode() == null) {
                currentNode.setNextNode(newNode);
                break;
            }
            currentNode = currentNode.getNextNode();
        }


        return null;
    }

    @Override
    public V remove(Object key) {

        Node<K, V> newNode = new Node(key, null);
        boolean isFind = false;
        int hash = getHash(newNode);

        if (nodes[hash] == null) {
            throw new IllegalArgumentException("Wrong key, try again");
        }

        Node<K, V> currentNode = nodes[hash];

        if (currentNode.getKey().equals(newNode.getKey()) && currentNode.getNextNode() == null) {
            nodes[hash] = null;
            isFind = true;
        } else {

            while (currentNode.getNextNode() != null) {
                if (currentNode.getKey().equals(newNode.getKey())) {
                    System.out.println(currentNode.getValue());
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    isFind = true;
                } else {
                    currentNode.setNextNode(currentNode.getNextNode());
                }
            }
        }
        if (!isFind) {
            throw new IllegalArgumentException("Wrong key, try again");
        }


        return newNode.getValue();
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = null;
        }
        size=0;

    }

    @Override
    public Set<K>keySet() {
        return new HashSet<K>();
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
