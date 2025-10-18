package org.abb_tech.lesson3.tasks;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 1};

        // Artan sıraya görə sort (Bubble sort və ya Selection sort istifadə edə bilərik)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Esas array : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Tərsinə sort edilmish array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

