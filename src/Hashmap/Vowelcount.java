package Hashmap;

import java.util.HashMap;

public class Vowelcount {
        public static void main(String[] args) {
            String str = "Hello World! This is a Test String";
            str = str.toLowerCase();  // optional to handle uppercase vowels

            HashMap<Character, Integer> vowelCount = new HashMap<>();
            vowelCount.put('a', 0);
            vowelCount.put('e', 0);
            vowelCount.put('i', 0);
            vowelCount.put('o', 0);
            vowelCount.put('u', 0);

            for (char c : str.toCharArray()) {
                if (vowelCount.containsKey(c)) {
                    vowelCount.put(c, vowelCount.get(c) + 1);
                }
            }

            System.out.println("Vowel Frequencies: " + vowelCount);
        }
    }
