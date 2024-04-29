package org.example;

public class E6 {
    //Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating
    // character. For example, in the string "abracadabra", the first non-repeating character is 'c'.
    public static void main(String[] args) {


        String word = "abracadabra";


        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(word.charAt(i));
                break;
            }
        }
    }
}
