
public class SplitIntoFunctions {

	public static void main(String[] args) {
		eat("Bread");
		sleep(12);
	}
	
	static void eat(String food) {
		System.out.println("Eating " + food);
	}
	
	static void sleep(int hours) {
		System.out.println("Sleeping " + hours + " hours");
	}

}
