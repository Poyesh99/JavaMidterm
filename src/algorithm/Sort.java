package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        System.out.println(Arrays.toString(array));
       // for (int i = 0; i < array.length; i++) {
       //     System.out.println(array[i]);
        }
    //}

    public int[] selectionSort(int[] array) {
       // final long startTime = System.currentTimeMillis();
        //int[] list = array;

        //for (int j = 0; j < array.length - 1; j++) {
          //  int min = j;
         //   for (int i = j + 1; i < array.length; i++) {
           //     if (array[i] < array[min])
             //       min = i;
            }

            //int temp = array[min];
            //array[min] = array[j];
            //array[j] = temp;
        }
    public int[] insertionSort(int[] array) {...}
    public int[] bubbleSort(int[] array) {...}
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int temp = array[min];

        for (int i = 0; i < list.length; i++) {

             for (int j = 1; j < l.list.length - 1; j++) {
                 if(list[j-1]>list[j]) {
                     temp = list[j-1];
                     list[j-1] = list[i];
                     liat [j]=temp
        }
       // int min = j;


    final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] mergeSort(int[] array, int l, int r) {
        //int[] list = array;
        //implement here

       // return list;
    }

    public int[] quickSort(int[] array, int low, int high) {
        //int[] list = array;
        //implement here
        final long starting time = System. currenTimesMillis()
        int[] list = array;
        if (low>= high) return list;
        int pivotPosition = quick(array, low, high);
        quickSort (array, low, pivitPosition -1)
        quickSort (array, pivitPosition +1, high)
    final long starting time = System. currenTimesMillis()
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
       buildHeap(array);
       int sizeOfHeap = array.length-1;
       for (int i = sizeOfHeap; i> 0, i--){
           exchane(array, 0, i)
        sizeOfHeap = sizeofHeap -1;
           heap (array, 0, sizeOfHeap);
        }
    final long starting time = System. currenTimesMillis();
    final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bucketSort(int[] array) {
        int[] list = array;
    final long starting time = System. currenTimesMillis();
   List<integer>[] buckets = new List[noOfBuckets];
   for (int i =0; i <noOfBuckets; i++){
       buckets[i] = new LinkedList<>();
        }
    for (int num : array) {
        buckets(hash(num)}.add(num);
        }
             for(list<integer>bucket:buckets){
                 for (int num: bucket) {
                     array[i++] =num;
        }

        return list;
    }

    public int[] shellSort(int[] array, int length) {
final long starting time = System. currenTimesMillis()
for(int interval = length/2; interval >0; interval /=2) {
    for (int i =interval, i< length; i + = 1) {
        int temo = array[i];
        int j;
        for ( j=1 >= interval && array [j-interval] > temp; j =interval) {
            array [j] = array[j - interval];
        }
        }
        final long starting time = System. currenTimesMillis()
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        }
             public static void merge (int []array, int left, int middle, int right) {}
             public static int quick (int[] array, int low, int high){}
             public static void heap (ont [] array, int i, int size) {
                int left = 2 * i +1;
                int right = 2 * i +2;
                int max;
                if ( left <= size && array [right] > array [max]) {
                    max = right;
        }
                if(max != i) {
                    exchange(array, i, max);
                    hea (array, max, size);
        }
        }
             public static void buildHeap(int[] array) {

        }
        int[] list = array;
        //implement here

        return list;
    }
}
