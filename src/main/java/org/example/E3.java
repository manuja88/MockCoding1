package org.example;

public class E3 {
    //Check if a String is a Palindrome: Determine whether a given string is a palindrome,
    //which means it reads the same forwards and backwards. For example,"madam" is a palindrome.

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();


        int left = 0;
        int right = str.length() - 1;


        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move the pointers towards the center
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String testStr = "madam";
        if (isPalindrome(testStr)) {
            System.out.println(testStr + " is a palindrome.");
        } else {
            System.out.println(testStr + " is not a palindrome.");
        }
    }
}
