package HW_Algorithms.HW_Algorithms29_11_22;

import java.util.Random;
/*todo 1. На основе кода из гита выполнить сравнение производительности
        алгоритмов bubble sort и quick sort при количестве элементов в 1000, 10 000, 100 000
        (Опционально можно применить эти же проверки к merge sort).
       2 Вычислить скорость выполнения обоих алгоритмов сортировки в наносекундах (использовать System.nanoTime) до и после выполнения метода*/

public class Main {
    static long cou1 = 1;
    static long cou2 = 1;

    public static void main(String[] args) {

        long t1 = System.nanoTime();
        quickSort(getArray(1000), 0, getArray(1000).length - 1);
        System.out.println((System.nanoTime() - t1) + " ms." + "   " + cou1);
        bubbleSort(getArray(1000));
        System.out.println(cou2);
        long t2 = System.nanoTime();
        quickSort(getArray(10000), 0, getArray(10000).length - 1);
        System.out.println((System.nanoTime() - t2) + " ms." + "   " + cou1);
        bubbleSort(getArray(10000));
        System.out.println(cou2);
        long t3 = System.nanoTime();
        quickSort(getArray(100000), 0, getArray(100000).length - 1);
        System.out.println((System.nanoTime() - t3) + " ms." + "   " + cou1);
        bubbleSort(getArray(100000));
        System.out.println(cou2);

    }

    public static int[] getArray(int size) {
        Random r = new Random();
        int[] rrrr = new int[size];
        for (int i = 0; i < size; i++) {
            rrrr[i] = r.nextInt();
        }
        return rrrr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = findPivotIndex(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int findPivotIndex(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pivotIndex = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                pivotIndex++;
                int tmp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = tmp;
                cou1++;
            }
        }
        int tmp = arr[pivotIndex + 1];
        arr[pivotIndex + 1] = arr[high];
        arr[high] = tmp;
        return pivotIndex + 1;
    }

    static void bubbleSort(int[] arr) {
        long time = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    cou2++;
                }
            }
        }
        System.out.println((System.nanoTime() - time) + " ms.");
    }
}