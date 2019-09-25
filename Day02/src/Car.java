//Has characteristics (or) attributes
//Has behaviour
//Characteristics are represented by variables
//Behaviour is represented by methods

//NO GLOBAL VARIABLES IN JAVA
//LOCAL variables, MEMBER variables, STATIC variables
public class Car {
	//Member variables
	String model;
	int yearOfMake;
	String color;
	boolean electric;
	
	void drive(int speed) {
		System.out.println("Driving " + model + " at a speed of " + speed + " kmph");
	}
	
	void start() {
		System.out.println("Starting " + model);
	}
	
}
