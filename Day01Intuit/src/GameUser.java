import java.util.Scanner;

public class GameUser {

	public static void main(String[] args) {
		Game game = new Game();
		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		while(!game.gameOver) {
			guess = scanner.nextInt();
			game.play(guess);
			System.out.println(game.message);
		}
	}

}
