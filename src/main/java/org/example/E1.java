package org.example;

public class E1 {
    //How many alpha characters are present in a String?

    public static void main(String[] args) {
        String str="I love my life";
        int number =0;

        for(int i = 0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                number++;
            }
        }
        System.out.println(number);
    }
}

