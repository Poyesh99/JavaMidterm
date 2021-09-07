package algorithm;

import org.testng.Assert;

import java.util.Random;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        Numbers makeRandom = new Numbers();

        // Create instance of Sort class
        Sort sort = new Sort();

        // Pass the unsorted array to selectionSort() method from Sort class
        sort.selectionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        randomize(unSortedArray, unSortedArray.length);

        //*******************************************************************
        // Pass the unsorted array to selectionSort() method from Sort class
        sort.insertionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        randomize(unSortedArray, unSortedArray.length);


        //*******************************************************************
        // Pass the unsorted array to selectionSort() method from Sort class
        sort.bubbleSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        randomize(unSortedArray, unSortedArray.length);

        //*******************************************************************
        // Pass the unsorted array to selectionSort() method from Sort class
        sort.mergeSort(unSortedArray, unSortedArray.length);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        randomize(unSortedArray, unSortedArray.length);

        //*******************************************************************
        // Pass the unsorted array to selectionSort() method from Sort class
        int low = 0;
        int high = 6;
        sort.quickSort(unSortedArray,low, high );

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        randomize(unSortedArray, unSortedArray.length);

        //*******************************************************************
        // Pass the unsorted array to selectionSort() method from Sort class
        sort.heapSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        randomize(unSortedArray, unSortedArray.length);

        //*******************************************************************
        // Pass the unsorted array to selectionSort() method from Sort class
        sort.shellSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        randomize(unSortedArray, unSortedArray.length);

        // Implement Unit test for rest of the sorting algorithms below

    }



    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
