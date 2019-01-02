import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    
    private static final String HEADER_TITLE = "" 
        + "******************************************\n"
        + "MERGE SORT\n"
        + "******************************************";
    
    private static final String INST_READ_LENGTH = "Enter the array length: ";
    private static final String INST_ENTER_DATA = "Enter the values.";
    private static final Scanner SCAN = new Scanner(System.in);

    private static void print(String message) {
        System.out.print(message);
    }
    
    private static void println(String message) {
        System.out.println(message);
    }

    private static String readString() {
        return SCAN.nextLine();
    }
    private static Integer readInt() {
        return SCAN.nextInt();
    }

    private static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx1] = temp;
    }

    public static void quickSort(int[] array, int lo, int hi) {
        if (lo < hi) {
            int pivot = partition(array, lo, hi);
            quickSort(array, lo, pivot - 1);
            quickSort(array, pivot + 1, hi);
        }
    }

    private static int partition(int[] array, int lo, int hi) {
        
        int pivot = array[hi];
        int i = lo -1;

        for(int j=lo; j <= hi -1; j++){
            if(array[j]<=pivot){
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i+1, hi);

        return i + 1;
    }
    /*

    public static int[][] divide(int[] array) {
        int[][] result = new int[2][];

        int middle = (int) Math.ceil(array.length / 2);
        
        result[0] = Arrays.copyOfRange(array, 0, middle);
        result[1] = Arrays.copyOfRange(array, middle, array.length);

        return result;
    }

    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        int idx1 = 0;
        int idx2 = 0;
        int idxResult = 0;

        while (idxResult < result.length) {
            if (idx1 >= a1.length) {
                result[idxResult++] = a2[idx2++];
            } else if (idx2 >= a2.length) {
                result[idxResult++] = a1[idx1++];
            } else if (a1[idx1] < a2[idx2]) {
                result[idxResult++] = a1[idx1++];
            } else {
                result[idxResult++] = a2[idx2++];
            }
        }

        return result;
    }
    */

    private static void printArray(String label, int[] array) {
        for (int i = 0; i < array.length; i++) {
            println(label + "[" + i + "]= " + array[i]);
        }
    }

    private static String arrayToString(int [] array) {
        StringBuilder builder = new StringBuilder("[");
        if (array.length > 0) {
            builder.append(array[0]);
            for(int i = 1; i < array.length; i++) {
                builder.append("," + array[i]);
            }
        }
        return builder.append("]").toString();
    }

    public static void main(String[] args) {
        println(HEADER_TITLE);
        print(INST_READ_LENGTH);
        int length = readInt();
        println(INST_ENTER_DATA);

        int[] array = new int[length];
        
        for (int i = 0; i < length; i++) {
            print("Array[" + i + "]:");
            array[i] = readInt();
        }
        quickSort(array, 0, array.length - 1);
        println("Sorted:");
        printArray("Merged", array);
    }
}