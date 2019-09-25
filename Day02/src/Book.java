public class Book {
	//member variables
	String title;
	double price;
	String author;
	String category;
	boolean inStock;
	
	//constructor is a special function with the same name as the class
	//It does not return anything
	Book(String theTitle, double thePrice, String theAuthor) {
		title = theTitle;
		price = thePrice;
		author = theAuthor;
	}
	
	//member functions
	void purchase(String store) {
		System.out.println("Buying " + title + " from " + store);
	}
	
}
