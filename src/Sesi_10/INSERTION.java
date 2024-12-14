package Sesi_10;

import java.util.Arrays;

public class INSERTION {
    public static void main(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }        
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Array sebelum diurutkan: " + Arrays.toString(arr));

        main(arr);

        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }
}