package javaProgramPractice.javaBasicPrgs.fibonnaciSeries;

import java.util.Scanner;

public class FibonacciSeriesEx1 {
//Fibonacci series without recursion.
	
	public static void main(String[] args) {

		
		try (Scanner sc = new Scanner(System.in)) {
			int n1=0,n2=1,n3=0;
			
			System.out.println("Enter the number of elements in the fibonnaci series to be displayed: ");
			int elements=sc.nextInt();
			
			System.out.print("The "+elements+" "
					+ "elements of Fibonnaci Series are : \t0\t1");
			
			for (int i=2;i<elements;i++) {
				n3=n1+n2;
				System.out.print(n3+"\t");
				n1=n2;
				n2=n3;
				
			}
		}
	}

}
