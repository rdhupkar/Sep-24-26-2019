package com.intuit.inheritance;

public class AnimalTrainer {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		
		Dog snoopy = new Dog();
		Cat snow = new Cat();
		
		trainAnimal(snoopy);
		trainAnimal(snow);
		Manager sam = new Manager(11,11);
		
//		trainAnimal(sam);
//		trainDog(snoopy);
//		trainCat(snow);
	}

	//you can define a method that accepts a Base class reference
	//and you can pass derived class object into it
	//polymorphism
	public static void trainAnimal(Animal animal) {
		animal.eat();
	}
	
//	public static void trainDog(Dog dog) {
//		dog.eat();
//	}
//	
//	public static void trainCat(Cat cat) {
//		cat.eat();
//	}
	
	

	

}
