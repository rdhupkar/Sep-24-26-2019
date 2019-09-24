public class SimpleConditional {

	public static void main(String[] args) {
		int x = 10;
		x++;
		++x;
		x += 1;
		x -= 1;
		
		int number = 12;
		if(number % 2 == 0) {
			System.out.println(number + " is Even");
		}
		else {
			System.out.println(number + " is Odd");
		}
		
		String result = number % 2 == 0 ? "Even" : "Odd";
		System.out.println(result);
		
		
		
	}

}
