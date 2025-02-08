package iterativerecursivefibonaccicomparison;

import static iterativerecursivefibonaccicomparison.FibonacciIterative.fibonacciIterative;
import static iterativerecursivefibonaccicomparison.FibonacciRecursive.fibonacciRecursive;

public class Main {

    public static void comparePerformance(int n) {
        long startTime, elapsedTime;

        // Recursive Fibonacci
        startTime = System.nanoTime();
        int fibRec = fibonacciRecursive(n);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Fibonacci(%d) Recursive: %d | Time: %,dns%n", n, fibRec, elapsedTime);

        // Iterative Fibonacci
        startTime = System.nanoTime();
        int fibIter = fibonacciIterative(n);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Fibonacci(%d) Iterative: %d | Time: %,dns%n", n, fibIter, elapsedTime);
    }

    public static void main(String[] args) {
        int[] testCases = {10, 30, 50}; // Change values if needed
        for (int n : testCases) {
            comparePerformance(n);
        }
    }
}
