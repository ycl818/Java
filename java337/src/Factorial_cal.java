
public class Factorial_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans1 = 1;
		for (int i = 10 ; i > 1 ; i--) {
			ans1*=i;
		}
		System.out.println("10! = " + ans1);
	
	int ans2 =1;
	int x =2;
	int n =10;
	
	for(int i = 1; i <= n; i++) {
		ans2 = ans2 * x ;
	}
	System.out.println(x +"^"+n + "="+ans2);

}
}