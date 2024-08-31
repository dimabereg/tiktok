package org.example;

public class quiz50 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
