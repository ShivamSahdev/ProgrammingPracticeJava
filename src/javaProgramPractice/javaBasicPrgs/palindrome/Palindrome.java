package javaProgramPractice.javaBasicPrgs.palindrome;

public class Palindrome {

	public static void main(String[] args) {

		System.out.print(reverseOfNumber(13435));
		System.out.println(reverseOfString("Shivam"));
		System.out.println(reverseOfStringUsingStringBuilder("Shivam"));
		if(isPalindrome1("raara"))
			System.out.println("it is Palindrome");
		else 
			System.out.println("it is not a Palindrome");
		
		
	}
	
	static int reverseOfNumber(int n) {
		
		int reverse=0;
		
		
		while(n>0) {					//for(;n>0;n/=10){
			reverse=(reverse*10)+(n%10);
			n/=10;
		}
		return reverse;
	}
	
	
	static String reverseOfString(String s) {
		
		String reverse="";
		
		for (int i=s.length()-1; i>=0;i--) {
			reverse= reverse+ s.charAt(i);	
		}
		return reverse;
	}
	
	static String reverseOfStringUsingStringBuilder(String s) {
		
//		StringBuilder sb=new StringBuilder(s);
//		
//		sb.reverse();
//		String reverse=sb.toString();
//		return reverse;
//		
		 return new StringBuilder(s).reverse().toString();
	}
	
	
	static boolean isPalindrome(String s) {
		if(s.equals(reverseOfString(s)))
			return true;
		return false;
	}

	
	
	static boolean isPalindrome1(String s ) {
		int l=s.length();
		
		for(int i=0,j=l-1;i<l/2;i++,j--) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
}
