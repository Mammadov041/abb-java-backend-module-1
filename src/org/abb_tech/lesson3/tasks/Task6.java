package org.abb_tech.lesson3.tasks;

public class Task6 {
    public static void main(String[] args) {
        String word = "madam";

        if (isPalindrome(word)) {
            System.out.println(word + " palindrome-dur.");
        } else {
            System.out.println(word + " palindrome deyil.");
        }
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

