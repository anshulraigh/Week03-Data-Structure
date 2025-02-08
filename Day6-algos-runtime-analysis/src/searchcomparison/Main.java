package searchcomparison;

import java.util.Arrays;
import java.util.Random;

import static searchcomparison.BinarySearch.binarySearch;
import static searchcomparison.LinearSearch.linearSearch;

public class Main {

    public static void compareSearchPerformance(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(size * 10);
        }
        int target = data[size / 2];
        long startTime = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - startTime;
        Arrays.sort(data);
        startTime = System.nanoTime();
        binarySearch(data, target);
        long binaryTime = System.nanoTime() - startTime;

        System.out.printf("Dataset Size: %,d | Linear Search: %,dns | Binary Search: %,dns\n", size, linearTime, binaryTime);
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        for (int size : datasetSizes) {
            compareSearchPerformance(size);
        }
    }
}