
public class BookUser {

	public static void main(String[] args) {
		int i;
		i = 10;
		
		//It calls the default no argument constructor
		//Book b = new Book();
		
		//String[] arr = { "one", "two" };
//		String[] arr;
//		arr = new String[] { "one", "two" };
		
		Book book1 = new Book("Programming Scala", 34.56, "Bruce");
//		book1.title = "Programming Scala";
//		book1.price = 34.56;
//		book1.author = "Bruce";
		book1.purchase("Amazon");
		
		Book book2 = new Book("RoR", 35.53, "Dave Thomas");
		book2.purchase("FK");
		
	}

}
