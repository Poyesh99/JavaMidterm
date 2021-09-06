package algorithm;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        int n = list.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (list[j] > list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] mergeSort(int[] array,int n) {

        final long startTime = System.currentTimeMillis();
        int[] list = array;

        if (n < 2) {
            return list;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = list[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = list[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(list, l, r, mid, n - mid);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public int[] quickSort(int[] array, int low, int high) {
        final long startingtime = System.currentTimeMillis();
        int[] list = array;

        if (low < high) {
            int partitionIndex = partition(list, low, high);
            quickSort(list, low, partitionIndex-1);
            quickSort(list, partitionIndex+1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startingtime;
        this.executionTime = executionTime;
        return list;
    }

    private int partition(int list[], int low, int high) {
        int pivot = list[high];
        int i = (low-1);

        for (int j = low; j < high; j++) {
            if (list[j] <= pivot) {
                i++;

                int swapTemp = list[i];
                list[i] = list[j];
                list[j] = swapTemp;
            }
        }

        int swapTemp = list[i+1];
        list[i+1] = list[high];
        list[high] = swapTemp;

        return i+1;
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        int n = list.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            heapify(list, i, 0);
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && arr[l] > arr[largest])
            largest = l;


        if (r < n && arr[r] > arr[largest])
            largest = r;


        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            heapify(arr, n, largest);
        }
    }

    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int n = list.length;
        if (n <= 0)
            return list;


        List<Integer>[] buckets = new List[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<>();
        }


        for (int i = 0; i < n; i++) {
            float idx = list[i] * n;
            buckets[(int)idx].add(list[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }


        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                list[index++] =  buckets[i].get(j);
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        int n = list.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = list[i];
                int j = i;
                while (j >= gap && list[j - gap] > key) {
                    list[j] = list[j - gap];
                    j -= gap;
                }
                list[j] = key;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
}
