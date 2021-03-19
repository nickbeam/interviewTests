package ru.tests;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        int temp;
        boolean isSorted;
        for (int i = 0; i < length; i++) {
            isSorted = true;
            for (int j = 1; j < (length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        bubbleSort(new int[] {5, 8, 111, 1, 22, 999, 333, -55, 0, -1});
    }
}
