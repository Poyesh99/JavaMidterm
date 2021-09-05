package math.problems;

public class FindLowestDifference {

        /*
         Write a method to return  the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

    public static void main(String[] args) {

    }

    public static int[] findlowestestDifference(int[] a1, int[] a2) {
        int[] array1 = new int[]{30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = new int[]{18, 25, 41, 47, 17, 36, 14, 19};

        int[] pair = findlowestestDifference(array1, array2);
        System.out.println(pair[0] + " " + pair[1]);
        double smallestDiff = Double.MAX_VALUE;
        int[] smallestDiffPair = new int[2];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                int currentDiff = Math.abs(a1[i] - a2[j]);
                if (currentDiff < smallestDiff) {
                    smallestDiff = currentDiff;
                    smallestDiffPair[0] = a1[i];
                    smallestDiffPair[1] = a2[j];
                }
            }
        }
        return smallestDiffPair;
    }
}








