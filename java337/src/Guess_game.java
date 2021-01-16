import java.util.Scanner;
public class Guess_game {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		//generate a random number between 0~99
		int key =(int) (Math.random()*100); 
		System.out.println(key);
		
		int min = 0;
		int max = 99;
		System.out.println("(" + min + "," + max + ")?");
		int guess = -1;
		
		
		while(guess!=key) {
			guess = input.nextInt();
			if(guess == key) {
				System.out.println("Bingo");
				break;
			}
			if(guess > key) {
				max = guess -1;
				System.out.println("(" + min + "," + max + ")?");
				
			}
			if (guess < key) {
				min = guess +1;
				System.out.println("(" + min + "," + max + ")?");
				
			}
			if (guess <0 && guess >99) {
				System.out.println("Out of range. Try again!");
				
			}
		}
		input.close();
	}

}
