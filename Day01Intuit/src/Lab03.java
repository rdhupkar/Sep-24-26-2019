
public class Lab03 {

	public static void main(String[] args) {
		partA();
		partB1();
		partB2();
	}
	
	static void partB2() {
		String input = "p5 m1 p9 p5 m7 p5 m3 p2 m4 p6 p8";
		String[] numbers = input.split(" ");
		int total = 0;
		for (String number : numbers) {
			char firstChar = number.charAt(0);
			switch (firstChar) {
				case 'p':
					total += Integer.parseInt("+" + number.charAt(1));
					break;
				case 'm':
					total += Integer.parseInt("-" + number.charAt(1));
					break;
				default:
					break;
			}
		}
		System.out.println("Total: " + total);
		
	}
	
	static void partB1() {
		String input = "p5 m1 p9 p5 m7 p5 m3 p2 m4 p6 p8";
		input = input.replaceAll("p", "+").replaceAll("m", "-");
		String[] numbers = input.split(" ");
		int total = 0;
		for (String number : numbers) {
			int num = Integer.parseInt(number);
			total += num; 
		}
		System.out.println("Total: " + total);
	}
	
	static void partA() {
		String input = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8";
		String[] numbers = input.split(" ");
		int total = 0;
		for (String number : numbers) {
			int num = Integer.parseInt(number);
			total += num; 
		}
		System.out.println("Total: " + total);
	}

}
