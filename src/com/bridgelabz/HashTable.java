package com.bridgelabz;

/**
 * Author:-Sunanda Shil
 */

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable program");
        LinkedList<String, Integer> list = new LinkedList();
        String message = "Bridgelabz is kind of institute where you can learn concept and get job";
        String[] words = message.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = list.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            list.add(word, value);
        }
        System.out.println(list);
    }
}
