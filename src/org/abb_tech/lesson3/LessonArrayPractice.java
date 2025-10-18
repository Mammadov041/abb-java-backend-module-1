package org.abb_tech.lesson3;

import java.math.BigDecimal;

public class LessonArrayPractice {
    static void main() {
        // One dimensional array

        BigDecimal[] salaries = new BigDecimal[3];

        double[] percentages = {3.2, 5, 7.8};
        int[] ages = new int[]{1, 2, 3};
        long[] total = new long[3];

        total[4] = 10;


//        for (int i = 0; i < percentages.length; i++) {
//            System.out.println("Percentage: " + percentages[i] + "");
//        }

        salaries[0] = new BigDecimal("100000");
        ages[2] = 10;

        for (int i = 0; i < total.length; i++) {
            total[i] = i + 10;
        }


        Cat[] cat = new Cat[3];

        for (int index = 0; index < percentages.length; index++) {
            //   System.out.println(percentages[index]);
        }

        for (int element : ages) {
            //    System.out.println(element);
        }


        // two dimensional array

        byte b[][] = {
                {5, 6, 7, 8},
                {4, 4, 3, 7},
                {12, 54, 55}
        };

        for (int i = 0; i < b.length; i++) {
            for (int k = 0; k < b[i].length; k++) {
                System.out.println("ARRAY: " + b[i][k]);
            }
        }

        System.out.println("Custom: " + b[1][2]);


        // three dimensional array

        int[][][] threeDimensionalArray = new int[3][4][5];

        int[][][] threeDimensionalArrayWithElements = {
                {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},

                },

                {
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {161, 171, 181, 191, 201},
                        {162, 172, 182, 192, 202}
                }
        };
//        System.out.println("First length " + threeDimensionalArrayWithElements.length);
//        System.out.println("Second length " + threeDimensionalArrayWithElements[1][1].length);


        for (int i = 0; i < threeDimensionalArrayWithElements.length; i++) {
            for (int j = 0; j < threeDimensionalArrayWithElements[i].length; j++) {
                for (int k = 0; k < threeDimensionalArrayWithElements[i][j].length; k++) {
                    System.out.println("Three Dimensional Array: " + threeDimensionalArrayWithElements[i][j][k]);

                }

            }

        }

        for (int[][] firstElements : threeDimensionalArrayWithElements) {
            for (int[] secondElements : firstElements) {
                for (int element : secondElements) {
                    System.out.println("Three Dimensional Array: " + element);

                }
            }

        }


    }
}
