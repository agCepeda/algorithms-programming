import java.util.Scanner;

public class SelectionSort {
    private static final String HEADER_TITLE = "" 
        + "******************************************\n"
        + "SELECTION SORT\n"
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

    private static int[] selectionSort(int[] array) {
        int current = 0;
        while(current < array.length - 1) {
            int index = getIndexSmallestValue(array, current);

            int temp = array[current];
            array[current] = array[index];
            array[index] = temp;

            current++;
        }

        return array;
    }

    private static int getIndexSmallestValue(int[] array, int lb) {
        int smallest = lb++;

        while (lb < array.length) {
            if (array[lb] < array[smallest]) {
                smallest = lb;
            }
            lb++;
        }

        return smallest;
    }

    public static final void main(String[] args) {
        println(HEADER_TITLE);
        print(INST_READ_LENGTH);
        int length = readInt();
        println(INST_ENTER_DATA);

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            print("Array[" + i + "]:");
            array[i] = readInt();
        }
        println("Sorted Array");
        selectionSort(array);
        for (int i = 0; i < length; i++) {
            println("Array[" + i + "]= " + array[i]);
        }
    }
}