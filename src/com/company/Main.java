package com.company;

public class Main {

    public static boolean search(int[] numbers, int x) {
        int start = 0;
        int end = numbers.length - 1;

        while (end >= start) {
            int mid = (end + start) / 2;
            if (x < numbers[mid]) {
                start = mid + 1;
            } else if (x == numbers[mid]) {
                return true;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {88, 56, 40, 32, 23, 20, 18, 15, 9, 6, 3, 2};
        System.out.println(search(numbers, 666));
    }
}
