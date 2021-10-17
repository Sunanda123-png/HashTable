package com.bridgelabz;

public class LinkedList<K,V> {
    MyMapNode head;
    MyMapNode tail;

    // creating add method
    public void add(K key, V value) {
        MyMapNode<K, V> myNewNode = (MyMapNode<K, V>) searchNode(key);
        if (myNewNode == null) {
            myNewNode = new MyMapNode<>(key, value);
            this.append(myNewNode);
        } else {
            myNewNode.setValue(value);
        }
    }

    // Append the value in the linked list
    public void append(MyMapNode<K, V> myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    // Searching for the word in the linked list
    public MyMapNode<K, V> searchNode(K data) {
        MyMapNode<K, V> currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    // here we are Searching for the word and getting the value from the linked list
    public V get(K word) {
        MyMapNode<K, V> myMapNode = searchNode(word);
        return (myMapNode == null) ? null :myMapNode.getValue();
    }

    // Print the linked list
    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + "}";
    }

    public void printNodes() {
        System.out.println("My nodes: " + head);
    }
}
