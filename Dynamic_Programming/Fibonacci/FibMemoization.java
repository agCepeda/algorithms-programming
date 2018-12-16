import java.util.LinkedHashMap;
import java.util.Scanner;

public class FibMemoization {

    static LinkedHashMap memo = new LinkedHashMap<Integer, Integer>();

    public static final int fibonacci(int num) {
        System.out.println("\t- f("+ num +")");

        if (num == 0) return 0;
        if (num <= 2) return 1;

        // Check if the value is already computed, if it is then return the result saved
        if (memo.containsKey(num)) {
            return (int) memo.get(num);
        }

        // If the value was not calculated before, then it is calculated.
        int result = fibonacci(num - 1) + fibonacci(num - 2);
        memo.put(num, result);

        return result;
    }
    public static void main(String[] args) {
        System.out.println("FIBONACCI Memoization Example \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Fibonacci(" + number + ") = " + fibonacci(number));
    }
}