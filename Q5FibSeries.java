// 5. Fibonacci Series using recursion
// We can use a for loop to print fibonacci series.

public class Q5FibSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ,");
            a = b;
            b = c;
            c = a + b;
        }
        int n = 10;

        System.out.println(printFibSeriesRe(n));

    }

    public static int printFibSeriesRe(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibSeriesRe(n - 1) + printFibSeriesRe(n - 2);
    }
}