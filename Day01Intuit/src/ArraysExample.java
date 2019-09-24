import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		
		//Arrays are fixed size collections
		//int[] numbers = { 1, 2, 3, 4, 5 };
		//int[] numbers = new int[5];

		String[] langs1 = new String[5];
		String langs2[] = new String[5];
		
		boolean[] switches = new boolean[5];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		
		System.out.println("Size of the array -  " + numbers.length);
		System.out.println("I: " + numbers[0]);
		System.out.println("II: " + numbers[1]);
		System.out.println("III: " + numbers[2]);
		System.out.println("IV: " + numbers[3]);
		System.out.println("V: " + numbers[4]);
		
		//Modify the collection
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * numbers[i];
			System.out.println(numbers[i]);
		}
		
		//foreach
		//just read and use the items
		//readable iterator
		for (int item : numbers) {
			System.out.println(item);
		}
		
		
		
		
		
		//System.out.println("VI: " + numbers[5]);
	}

}
