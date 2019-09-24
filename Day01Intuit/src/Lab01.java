import java.util.Scanner;

public class Lab01 {

	public static void mainOldStyle(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100");
		int target = (int)(Math.random() * 100);
		int attempts = 0;
		int guess = -1;
		while(guess != target) {
			guess = scanner.nextInt();
			attempts++;
			if(guess > target) {
				System.out.println("Aim Lower");
			}
			else if(guess < target) {
				System.out.println("Aim Higher");
			}
			else if(guess == target) {
				System.out.println("You've got it " + attempts + " attempts");
			}
		}
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number between 1 and 100");
		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		boolean gameOver = false;
		
		while(!gameOver) {
			guess = getNumberFromConsole(scanner);
			gameOver = play(guess);
		}
	}
	
	
	static int target = (int) (Math.random() * 100) + 1;
	static int attempts = 0;
	
	public static boolean play(int guess) {
		boolean gameOver = false;
		attempts++;
		if(guess > target) {
			System.out.println("Aim Lower");
		}
		else if(guess < target) {
			System.out.println("Aim Higher");
		}
		else if(guess == target) {
			System.out.println("You've got it " + attempts + " attempts");
			gameOver = true;
		}
		return gameOver;
	}
	
	public static int getNumberFromConsole(Scanner scanner) {
		int number = scanner.nextInt();
		return number;
	}
	
	
	
	

}
