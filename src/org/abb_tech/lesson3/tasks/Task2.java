package org.abb_tech.lesson3.tasks;

public class Task2 {
    static void main() {
        int [][] matrix = new int[][]{
                {10,20,30},
                {100,200,300},
                {1000,2000,3000}
        };
        int main_sum = 0;
        int helper_sum = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int b = 0;b<matrix[i].length;b++){
               main_sum += i == b ? matrix[i][b] : 0;
               helper_sum += i + b == 2 ? matrix[i][b] : 0;
            }
        }
        System.out.println(String.format("Sum of main diagonal %s",main_sum));
        System.out.println(String.format("Sum of helper diagonal %s",helper_sum));
    }
}
