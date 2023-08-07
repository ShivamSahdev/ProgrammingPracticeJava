package javaProgramPractice.javaBasicPrgs.fibonnaciSeries;



public class FibEx3 {
	
	// 1. reference to array fibCache, to store old results in so we donot have to recalculate it again 
	static long[] fibCache;

	static long fib(int n)
    {
        if (n <= 1)
            return n;
   //4. to check if values are stored in fibCache and so returned     
        if(fibCache[n]!=0)
        	return fibCache[n];
        
        long nthFibNo= fib(n - 1) + fib(n - 2);

     //3. to store the previous results in fibCache
        fibCache[n]=nthFibNo;
        
        return nthFibNo;
    }
 
    public static void main(String args[])
    {
        int n = 50;
  //2. initializing an array of size n+1(to cover values from 0 to n)      
        fibCache=new long[n+1];
        System.out.println( n + "th Fibonacci Number: " + fib(n));
    }
}
