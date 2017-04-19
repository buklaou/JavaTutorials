package Section11.PackagesStaticFinal.SeriesPackage;

/**
 * @author Raffi
 */
public class Series {

    public static int nSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int factorial(int n) {
        int sum=1;

        if (n == 0) {
            return 0;
        }

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        return sum;
    }

    public static long fibonacci(int n) {

        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;


        if (n == 0) {
            fib = 0;
        } else if (n == 1) {
            fib = 1;
        } else {
            for (int i = 1; i < n; i++) {
                fib = (nMinus1 + nMinus2);
                nMinus2 = nMinus1;
                nMinus1 = fib;
            }
        }
        return fib;

    }
}
