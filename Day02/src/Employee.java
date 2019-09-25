public class Employee {
	String id;
	String name;
	
	Employee(String theId, String theName) {
		id = theId;
		name = theName;
	}
	
	//Function overloading
	//Compile time polymorphism
	void work(int hours) {
		System.out.println("Employee " + name + " is working  " + hours + " hours") ;
	}
	
	void work() {
		System.out.println("Employee " + name + " is working 8 hours");
	}
	
	
}
