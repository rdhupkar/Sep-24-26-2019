
public class Lab02 {

	public static void main(String[] args) {
		int number = 10;
		int squaredNumber = calculateSquare(number);
		int incrementedNumber= increment(squaredNumber);
		int doubledNumber = doubleIt(incrementedNumber);
		System.out.println("Result: " + doubledNumber);
		
	}

	static String doSomething() {
		System.out.println("Time for lunch");
		return "Lunch";
	}
	
	//camelcase 
	public static int calculateSquare(int num) {
		System.out.println("****squaring " + num);
		return num * num;
	}
	
	public static int increment(int number) {
		System.out.println("****incrementing " + number);
		return number + 1;
	}
	
	public static int doubleIt(int number) {
		System.out.println("****doubling " + number);
		return number * 2;
	}
	
}
