public class MergeSort {
    public static void mergeSort(int[] array) {
    }

    public static boolean isEmpty(int index, int[] array) {
        return index < array.length;
    }

    public static int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        int idx1 = 0;
        int idx2 = 0;
        int idxResult = 0;

        while (idx1 < a1.length && idx2 < a2.length) {
            if (a1[idx1] < a2[idx2]) {
                result[idxResult++] = a1[idx1++];
            } else {
                result[idxResult++] = a2[idx2++];
            }
        }

        return result;
    } 

    public static void main(String[] args) {
    }
}