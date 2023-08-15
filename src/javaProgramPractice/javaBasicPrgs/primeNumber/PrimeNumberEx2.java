package javaProgramPractice.javaBasicPrgs.primeNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumberEx2 {
	
	static int MAX_SIZE=1000005;
	
	static ArrayList<Integer> primeNumberList=new ArrayList<>();
	
	static void nthPrimeNumber()
	{
		boolean[] isPrime=new boolean[MAX_SIZE];
//		for(i=0 ;i < MAX_SIZE ; i++)
//			isPrime[i]=true;
//		Making the all the values in isPrime as true at first 
		Arrays.fill(isPrime, true);
		
		for(int i = 2 ; ( i * i ) < MAX_SIZE ; i++)
		{
			if(isPrime[i]==true)
			{
				for(int j = i * i ; j < MAX_SIZE ; j+= i)						
				{
					isPrime[j] = false;
				}
			}
		}
			
		
		for(int i = 2 ; i < MAX_SIZE ; i++ )
		{
			if(isPrime[i] == true)
				primeNumberList.add(i);
		}
		
		
	}
	

//	Driver
	public static void main(String[] args) {
		
		nthPrimeNumber();
		
		System.out.println(primeNumberList.size());
		
	}

}
