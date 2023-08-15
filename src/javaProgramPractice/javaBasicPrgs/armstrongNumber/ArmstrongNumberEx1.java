package javaProgramPractice.javaBasicPrgs.armstrongNumber;

public class ArmstrongNumberEx1 {

	public static void main(String[] args) {

		if(isArmstrongNumber(1634)){
			System.out.println("The number is an Armstrong Number .");
		}
	}

	static boolean isArmstrongNumber(int n) {
		int arm = 0;
		int temp=n;
		int l=Integer.toString(n).length();
		
//		while(temp>0) {
//			l++;
//			temp=temp/10;
//		}
		
		temp=n;
		
		while (temp > 0){
			arm= arm+(int)Math.pow(temp % 10, l);  //double typecasted into int forcefully. 
			//or arm+=Math.pow(temp%10,l);
			temp /= 10;
		}
		
		System.out.println(arm);
		if (n == arm)
			return true;
		return false;
	}

}
