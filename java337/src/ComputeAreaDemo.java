import java.util.Scanner;

public class ComputeAreaDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// INPUT
		System.out.println("Enter r?");
		// Assign an integer from the keyboard to r.
		int r = input.nextInt();
		
		// ALGORITHM
		double A = r * r * 3.14;
		
		// OUTPUT
		System.out.println(A);
		input.close(); // Cleanup: reclaim the resource.
	}

}
