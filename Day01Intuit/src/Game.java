public class Game {
	int target = (int)(Math.random() * 100);
	int attempts = 0;
	boolean gameOver = false;
	String message = "";
	
	void play(int guess) {
		attempts++;
		if(guess > target) {
			message = "Aim Lower";
		}
		else if(guess < target) {
			message = "Aim Higher";
		}
		else {
			message = "You've got it in " + attempts +  " attempts";
			gameOver = true;
		}
	}
}
