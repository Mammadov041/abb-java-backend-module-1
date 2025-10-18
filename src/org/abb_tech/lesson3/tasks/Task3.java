package org.abb_tech.lesson3.tasks;

public class Task3 {
    static void main() {
        int [][][] cube = new int[][][]{
                {
                        {1,2},
                        {3,4},
                        {5,6}
                },
                {
                        {7,8},
                        {9,10},
                        {11,12}
                }
        };
        int sum = 0;
        for (int i = 0;i<cube.length;i++){
            for (int a = 0;a<cube[i].length;a++){
                for (int b = 0;b<cube[i][a].length;b++){
                    sum += cube[i][a][b];
                }
            }
        }
        System.out.println(String.format("Sum of elements in 3D array : %d",sum));
    }
}
