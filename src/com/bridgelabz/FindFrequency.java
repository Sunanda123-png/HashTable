package com.bridgelabz;
import java.util.LinkedHashMap;

public class FindFrequency {
    public static void main(String[] args) {
        System.out.println("Welcome to Hash Table program");
        LinkedHashMap<String, Integer> frequency = new LinkedHashMap<>();
        String message = "To be or not to be";

        String[] messageArray = message.toLowerCase().split(" ");
        for (String word : messageArray) {
            String processed = word.toLowerCase();
            if (frequency.containsKey(processed)) {
                frequency.put(processed, frequency.get(processed) + 1);
            } else {
                frequency.put(processed, 1);
            }
        }
        System.out.println(frequency);
    }
}
