import java.util.Scanner;
public class CashierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0, price =0;
		Scanner input = new Scanner(System.in);
		
		do{
			total += price;
			System.out.println("Enter price?");
			price = input.nextInt();
		}while(price >0);
		
		System.out.println("Total = "+ total);
		input.close();
	}

}
