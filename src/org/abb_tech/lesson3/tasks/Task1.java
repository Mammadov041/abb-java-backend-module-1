package org.abb_tech.lesson3.tasks;

public class Task1 {
    static void main() {
        int [] array = new int[]{11,55,21,129,4,-5,-45,120,555,125,222,556,-49};
        int min = array[0];
        int max = array[0];
        for (int i = 1;i<array.length;i++)
        {
            if(array[i] > max)
                max = array[i];
            else if(array[i] < min)
                min = array[i];
        }
        System.out.println("Minimum number of array : " + min);
        System.out.println("Maximum number of array : " + max);
    }
}
