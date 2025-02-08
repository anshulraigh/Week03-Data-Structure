package sortingcomparison;
import java.util.Random;

import static sortingcomparison.BubbleSort.bubbleSort;
import static sortingcomparison.MergeSort.mergeSort;
import static sortingcomparison.QuickSort.quickSort;

public class Main {

    public static void compareSortingPerformance(int size) {
        Random random = new Random();
        int[] data1 = new int[size];
        int[] data2 = new int[size];
        int[] data3 = new int[size];

        for (int i = 0; i < size; i++) {
            int num = random.nextInt(size * 10);
            data1[i] = data2[i] = data3[i] = num;
        }

        // Bubble Sort
        long startTime = System.nanoTime();
        bubbleSort(data1);
        long bubbleTime = System.nanoTime() - startTime;

        // Merge Sort
        startTime = System.nanoTime();
        mergeSort(data2, 0, size - 1);
        long mergeTime = System.nanoTime() - startTime;

        // Quick Sort
        startTime = System.nanoTime();
        quickSort(data3, 0, size - 1);
        long quickTime = System.nanoTime() - startTime;

        System.out.printf("Dataset Size: %,d | Bubble Sort: %,dns | Merge Sort: %,dns | Quick Sort: %,dns\n", size, bubbleTime, mergeTime, quickTime);
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        for (int size : datasetSizes) {
            compareSortingPerformance(size);
        }
    }
}
