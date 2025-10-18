package org.abb_tech.lesson3.tasks;

public class Task7 {
    public static void main(String[] args) {
        String sentence = "Java is awesome";

        sentence = sentence.toLowerCase();

        System.out.println("Hərflərin təkrarlanma sayı:");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < sentence.length(); i++) {
                char current = sentence.charAt(i);

                if (current == ch) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(ch + " - " + count);
            }
        }
    }
}

