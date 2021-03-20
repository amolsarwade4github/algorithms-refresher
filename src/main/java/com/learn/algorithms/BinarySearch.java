package com.learn.algorithms;

/**
 * @author Amol.Sarwade
 */
public class BinarySearch {

    public static void main(String[] args) {
        int numberToSearch = -4;
        int index = search(new int[] {1, 2, 3, 4, 5}, numberToSearch);
        if (index == -1) {
            System.out.println("Number " + numberToSearch + " doesn't present");
        } else {
            System.out.println("Number " + numberToSearch + " present at index " + index);
        }
    }

    public static int search(int[] numbers, int numberToSearch) {
        int high = numbers.length - 1;
        int low = 0;
        while (low < high) {
            int mid = high - low / 2;
            int guess = numbers[mid];
            if (guess == numberToSearch) {
                return mid;
            } else if (guess < numberToSearch) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
