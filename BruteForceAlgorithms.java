import java.util.Scanner;
// Brute Force Algorithms
public class BruteForceAlgorithms {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose an algorithm:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Bubble Sort");
            System.out.println("4. Selection Sort");
            System.out.println("5. Exhaustive Search (Fibonacci)");
            System.out.println("6. Factorial Calculation");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> linearSearch();
                case 2 -> binarySearch();
                case 3 -> bubbleSort();
                case 4 -> selectionSort();
                case 5 -> exhaustiveSearchFibonacci();
                case 6 -> factorialCalculation();
                default -> System.out.println("Invalid choice");
            }
        }
    }

    // Linear Search
    public static void linearSearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        long startTime = System.nanoTime();
        int result = linearSearch(arr, target);
        long endTime = System.nanoTime();

        System.out.println("Linear Search result: " + result);
        System.out.println("Running time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time complexity: O(n)");
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static void binarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        long startTime = System.nanoTime();
        int result = binarySearch(arr, target);
        long endTime = System.nanoTime();

        System.out.println("Binary Search result: " + result);
        System.out.println("Running time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time complexity: O(log n)");
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Bubble Sort
    public static void bubbleSort() {
        int[] arr = {5, 2, 8, 3, 1, 6, 4};

        long startTime = System.nanoTime();
        bubbleSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Bubble Sort result: " + java.util.Arrays.toString(arr));
        System.out.println("Running time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time complexity: O(n^2)");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort() {
        int[] arr = {5, 2, 8, 3, 1, 6, 4};

        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();

        System.out.println("Selection Sort result: " + java.util.Arrays.toString(arr));
        System.out.println("Running time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time complexity: O(n^2)");
    }
// Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Exhaustive Search (Fibonacci)
    public static void exhaustiveSearchFibonacci() {
        int target = 13;

        long startTime = System.nanoTime();
        int result = exhaustiveSearchFibonacci(target);
        long endTime = System.nanoTime();

        System.out.println("Exhaustive Search (Fibonacci) result: " + result);
        System.out.println("Running time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time complexity: O(2^n)");
    }

    public static int exhaustiveSearchFibonacci(int target) {
        return switch (target) {
            case 0 -> 0;
            case 1 -> 1;
            default -> exhaustiveSearchFibonacci(target - 1) + exhaustiveSearchFibonacci(target - 2);
        };
    }

    // Factorial Calculation
    public static void factorialCalculation() {
        int n = 5; // Change the value of n to calculate the factorial of a different number

        long startTime = System.nanoTime();
        long result = factorial(n);
        long endTime = System.nanoTime();

        System.out.println("Factorial of " + n + ": " + result);
        System.out.println("Running time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Time complexity: O(n)");

    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
