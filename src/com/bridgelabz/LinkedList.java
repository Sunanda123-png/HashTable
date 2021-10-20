package com.bridgelabz;

public class LinkedList<K,V> {
    MyMapNode head;
    MyMapNode tail;

    public void add(K key, V value) {
        MyMapNode<K, V> myNewNode = (MyMapNode<K, V>) searchNode(key);
        if (myNewNode == null) {
            myNewNode = new MyMapNode<>(key, value);
            this.append(myNewNode);
        } else
        {
            myNewNode.setValue(value);
        }
    }

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

    public MyMapNode<K, V> searchNode(K data) {
        MyMapNode<K, V> presentNode = head;
        int position = 0;
        while (presentNode != null) {
            position++;
            if (presentNode.getKey().equals(data)) {
                return presentNode;
            }
            presentNode = presentNode.getNext();
        }
        return presentNode;
    }

    public V get(K word) {
        MyMapNode<K, V> myMapNode = searchNode(word);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }
    public void remove(K word) {

        MyMapNode presentNode = head;
        MyMapNode previousNode = null;
        if (presentNode != null) {
            previousNode.next = presentNode.next;
        }
        if (presentNode == null)
            System.out.println("Word not found!");
    }


    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + "}";
    }
}
