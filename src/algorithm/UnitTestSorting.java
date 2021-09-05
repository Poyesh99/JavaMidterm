package algorithm;

import org.testng.Assert;
import java.util.List;
import java.util.Random;
import java.util.Arrays;



public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
       // int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
      //  int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
8
        // Create instance of Sort class
        Sort sort = new Sort();
        int [] array = {11.15.16,12,10,20,19,13,14,18,17,5,4,1,2,3,7,6,9,8};
        System.out.println("This is the unSorted Array:" + Arrays.toString(array));

        sort.selectionSort(array);
        System.out.println("This is the integer array sorted with selectionSort:" + Arrays.toString(array));

        sort.insertionSort(array);
        System.out.println("This is the integer array sorted with insertionSort:" + Arrays.toString(array));

        sort.bubbleSort(array);
        System.out.println("This is the integer array sorted with bubbleSort:" + Arrays.toString(array));

        sort.mergesort(array, 0, array.length - 1);
        System.out.println("This is the integer array sorted with insertionSort:" + Arrays.toString(array));

        sort.quicksort(array, 0, array.length -1);
        System.out.println("This is the integer array sorted with quickSort:" + Arrays.toString(array));
        // Pass the unsorted array to selectionSort() method from Sort class
        sort.selectionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        // Implement Unit test for rest of the sorting algorithms below

    }
}
