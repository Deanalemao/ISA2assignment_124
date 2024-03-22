
package Question3_124;

public class FibonacciSeries {
    public static int[] generateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number of terms must be greater than zero");
        }

        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }
        }

        return fibonacciSeries;
    }

    public static void printFibonacci(int[] series) {
        System.out.print("Fibonacci Series: ");
        for (int num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
