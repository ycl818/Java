
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10000;
		
		double p = 0;
		for(int i = 0 ; i <= N ; i++) {
			 p += (4 *(Math.pow(-1,i)) / (2*i+1));
		}
		System.out.println("pi~ "+p);
	}

}
