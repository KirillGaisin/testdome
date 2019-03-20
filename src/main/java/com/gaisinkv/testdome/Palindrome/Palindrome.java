package com.gaisinkv.testdome.Palindrome;

public class Palindrome {
    //35min
    public static boolean isPalindrome(String word) {
        if(word.contains(" "))
            throw new RuntimeException("Input a word with no spaces");
        StringBuilder sb = new StringBuilder(word);
        String wordBackwards = sb.reverse().toString();
        return word.equalsIgnoreCase(wordBackwards);
        //var 2
//        char[] wordletters = word.toCharArray();
//        for (int i = 0; i < wordletters.length; i++) {
//            char current = Character.toLowerCase(wordletters[i]);
//            System.out.println("i= " + i);
//            System.out.println("current: " + current);
//            for (int j = wordletters.length-1; j >= 0; j--) {
//                System.out.println("j= " + j);
//                char toCompareWith = Character.toLowerCase(wordletters[j]);
//                System.out.println("toCompareWith: " + toCompareWith);
//                if(i==j) {
//                    System.out.println("First half of the word is identical to the second - word is a palindrome.");
//                    return true;
//                }
//                if(current==toCompareWith) {
//                    current = Character.toLowerCase(wordletters[i+1]);
//                    System.out.println("i= " + ++i);
//                    System.out.println("current: " + current);
//                } else return false;
//            }
//        }
//        return true;
        //var 3
//        int i = 0;
//        int j = word.length()-1;
//        while (i!=j) {
//            if (word.toLowerCase().charAt(i)==word.toLowerCase().charAt(j)) {
//                i++;
//                j--;
//            } else {
//                return false;
//            }
//        }
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
