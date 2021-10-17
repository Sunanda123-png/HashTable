package com.bridgelabz;

/**
 * Author:-Sunanda Shil
 */

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Hash Table program ");
        LinkedList<String, Integer> hashCode = new LinkedList();
        String message = "To be or not to be";
        String[] words = message.toLowerCase().split(" ");
        for(String word : words) {
            //Search for the word in the linked list
            Integer value = hashCode.get(word);
            if (value == null)
            {
                value = 1;
            }
            else
            {
                value = value + 1;
                hashCode.add(word, value);
            }
        }
        System.out.println(hashCode);
    }
}
