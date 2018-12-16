import java.util.Scanner;

public final class FibRecursion {

    public static final int fibonacci(int num) {
        System.out.println("\t- f("+ num +")");
        if (num == 0) return 0;
        if (num <= 2) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        System.out.println("FIBONACCI Recursion Example \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Fibonacci(" + number + ") = " + fibonacci(number));
    }
}