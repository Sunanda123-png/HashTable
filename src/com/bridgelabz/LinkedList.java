package com.bridgelabz;

import java.util.ArrayList;

public class LinkedList<K,V> {
    MyMapNode head;
    MyMapNode tail;
    private final int numOfBuckets;
    ArrayList<MyMapNode<K, V>> myBucketArray;

    public LinkedList() {
        this.numOfBuckets = 20;
        this.myBucketArray = new ArrayList<>();
        for (int i = 0; i < numOfBuckets; i++)
            this.myBucketArray.add(null);
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyMapNode<K, V> myNewNode = this.myBucketArray.get(index);
        if (myNewNode == null) {
            myNewNode = new MyMapNode<>(key, value);
            this.myBucketArray.set(index, myNewNode);
        }
        myNewNode = (MyMapNode<K, V>) searchNode(key);
        if (myNewNode == null) {
            myNewNode = new MyMapNode<>(key, value);
            this.append(myNewNode);
        } else {
            myNewNode.setValue(value);
        }
    }

    private int getBucketIndex(K word) {
        int hashCode = Math.abs(word.hashCode());
        int index = hashCode % numOfBuckets;
        return index;
    }

    public void append(MyMapNode<K, V> myNewNode) {
        if (this.head == null)
            this.head = myNewNode;
        if (this.tail == null)
            this.tail = myNewNode;
        else {
            this.tail.setNext(myNewNode);
            this.tail = myNewNode;
        }
    }

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

    public V get(K word) {
        int index = this.getBucketIndex(word);
        MyMapNode<K, V> myNewNode = this.myBucketArray.get(index);
        if (this.myBucketArray.get(index) == null)
            return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) searchNode(word);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + "}";
    }

    public void printNodes() {
        System.out.println("My nodes: " + head);
    }
}
