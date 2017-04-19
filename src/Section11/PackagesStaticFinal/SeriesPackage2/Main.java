package Section11.PackagesStaticFinal.SeriesPackage2;

import Section11.PackagesStaticFinal.SeriesPackage.Series;

/**
 * @author Raffi
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Series.nSum(10));
        System.out.println("---------");

        System.out.println(Series.factorial(10));
        System.out.println("---------");

        for(int i = 0; i < 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
