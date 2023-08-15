package javaProgramPractice.javaBasicPrgs.primeNumber;

public class PrimeNumberEx1 {

	public static void main(String[] args) {
	
		if(isPrime(4))
			System.out.println("The number is a Prime number: ");
		else
			System.out.println("The number is not a Prime number : ");
		
	}
	
/* to check if a number is prime or not we need to divide it with number starting from 2 till n-1 
 * and if the number is fully divisible by any of the number than its not a prime number 
 * else its a prime number 
 * we can test the check from 2 till sqrt of n  as we do in maths 
 * 
 */

	static boolean isPrime(int n) {
		
		if(n<2)return false;
		
		for(int i=2; i<Math.sqrt(n);i++) {
			
			if(n%i==0)
				return false;
		}
		return true;
	}

}
