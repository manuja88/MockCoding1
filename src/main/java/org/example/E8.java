package org.example;

public class E8 {
    //Create a method to count how many vowels are present in a string “documentation”
    public static void main(String[] args) {
        String text = "documentation";
        int vowelCount = countVowels(text);
        System.out.println(vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
