package javaProgramPractice.javaBasicPrgs.factorial;

public class FactorialEx2 {

	public static void main(String[] args) {
		
		System.out.println(fact(5));
	}
	
	static int fact(int n) {
		int f=1;   	// can use fact as a as the variable instead of f
		for(int i=1; i<=n;i++) {
			f*=i;
		}
		return f;
	}
}
