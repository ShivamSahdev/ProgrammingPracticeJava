package javaProgramPractice.javaBasicPrgs.fibonnaciSeries;

public class FibonacciSeriesEx2 {

	static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n = 50;
        System.out.println(
            n + "th Fibonacci Number: " + fib(n));
    }
}
