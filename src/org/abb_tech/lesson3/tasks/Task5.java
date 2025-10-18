package org.abb_tech.lesson3.tasks;

public class Task5 {
    public static void main(String[] args) {
        String input = "OpenAI";
        String reversed = reverseString(input);

        System.out.println("Revers edilmiş string: " + reversed);
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

