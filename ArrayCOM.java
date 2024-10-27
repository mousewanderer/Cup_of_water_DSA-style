import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArrayCOM {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 3, 8, 1, 2};
        
        //array data types
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        char[] charArray = {'A', 'B', 'C', 'D'};
        boolean[] boolArray = {true, false, true};
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        //__________________________________________________________________________________________________________________________________________________


        // asList - Convert array to List
        System.out.println("Array as List: " + Arrays.asList(numbers));

        // binarySearch - Search for an element using binary search
        Arrays.sort(numbers); // Array must be sorted before using binary search
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3 in sorted array: " + index);

        // copyOf - Copy an array with a new length
        int[] copyArray = Arrays.copyOf(numbers, 7);
        System.out.println("Copied array with new length: " + Arrays.toString(copyArray));

        // copyOfRange - Copy a specific range of the array
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copied range (1 to 4): " + Arrays.toString(rangeCopy));

        // deepEquals - Check if two arrays are deeply equal
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println("Are arrays deeply equal? " + Arrays.deepEquals(array1, array2));

        // deepToString - Deep string representation of arrays
        Integer[][] deepArray = {{1, 2}, {3, 4}};
        System.out.println("Deep toString: " + Arrays.deepToString(deepArray));

        // fill - Fill an array with a specified value
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 9);
        System.out.println("Array after fill: " + Arrays.toString(fillArray));

        // hashCode - Get hash code of an array
        System.out.println("Hash code of numbers array: " + Arrays.hashCode(numbers));

        // mismatch - Find the first mismatch index between two arrays
        int[] mismatchArray1 = {1, 2, 3};
        int[] mismatchArray2 = {1, 2, 4};
        int mismatchIndex = Arrays.mismatch(mismatchArray1, mismatchArray2);
        System.out.println("First mismatch index: " + mismatchIndex);

        // parallelSort - Sort the array using parallel sort
        int[] parallelSortArray = {9, 4, 6, 3, 7};
        Arrays.parallelSort(parallelSortArray);
        System.out.println("Array after parallel sort: " + Arrays.toString(parallelSortArray));

        // setAll - Set all elements in the array using a generator function
        int[] setAllArray = new int[5];
        Arrays.setAll(setAllArray, i -> i * 2);  // Set each element as index * 2
        System.out.println("Array after setAll: " + Arrays.toString(setAllArray));

        // sort with Comparator - Sort an array using a custom comparator
        String[] fruits = {"Banana", "Apple", "Orange"};
        Arrays.sort(fruits, Comparator.reverseOrder());
        System.out.println("Fruits sorted in reverse order: " + Arrays.toString(fruits));

        // stream - Convert array to stream and print using forEach
        IntStream stream = Arrays.stream(numbers);
        System.out.print("Stream of numbers array: ");
        stream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // toString - Convert the array to a string representation
        System.out.println("Array toString: " + Arrays.toString(numbers));
    }
}
