/*A method that calls iself is known as recursive method , 
and this process is known as recursion */

public class Solution {

    // print n natural number
    public static void nNumbers(int n) {
        if (n <= 0) {
            return;
        }

        nNumbers(n - 1);
        System.out.println(n);
    }

    // print numbers in reverse order
    public static void nNumbersReverse(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        nNumbersReverse(n - 1);

    }

    // print sum of first n natural numbers
    public static int sumofN(int n) {

        if (n <= 1) {
            return 1;
        }
        return n + sumofN(n - 1);

    }

    public static void sumofN2(int n, int sum, int i) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        sumofN2(n, sum, i + 1);

    }

    public static int factorialN(int n) {
        // if(n<=1){
        // return 1;
        // }

        // return n*factorialN(n-1);
        return n <= 1 ? 1 : n * factorialN(n - 1);// one line factorial code
    }

    // nth fibonacci number print

    public static void fib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");

        fib(b, c, n - 1);
    }

    public static int fiboNth(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fiboNth(n - 1) + fiboNth(n - 2);

    }

    public static int powerOfX(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int res = powerOfX(x, n - 1);
        return x * res;

    }

    public static int powerOfX2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return powerOfX2(x, n / 2) * powerOfX2(x, n / 2);
        } else {
            return powerOfX2(x, n / 2) * powerOfX2(x, n / 2) * x;
        }

        // time complexity logn
    }

    public static void main(String[] args) {
        // ex-1 print n number using recurion
        // nNumbersReverse(10);
        // nNumbers(1);
        // sumofN2(5, 0, 1);
        // int res = factorialN(0);
        // System.out.println(res);
        // int n = 7;
        // int a = 0;
        // int b = 1;
        // System.out.print(a + " " + b + " ");
        // fib(a, b, n - 2);

        // System.out.println(fiboNth(10));
        // System.out.println(powerOfX(5, 2));
        System.out.println(powerOfX2(5, 3));

    }
}
