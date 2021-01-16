import java.util.Scanner;
public class Random_Integer_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = (int)Math.random()*10;
		//System.out.println((int)(Math.random()*11)+10);
		int x =(int)(Math.random()*10);
		int y =(int)(Math.random()*10);
		System.out.println(x+"+"+y+"=?");	
		
		Scanner input = new Scanner(System.in);
		int z = input.nextInt();
		input.close();
		if(z == x+y) {
			System.out.println("Correct");
		}else {
			System.out.println("Wrong");
			System.out.println("It is "+ (x+y)+ ".");
		}
	}

}
