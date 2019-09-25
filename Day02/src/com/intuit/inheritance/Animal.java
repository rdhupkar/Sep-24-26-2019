package com.intuit.inheritance;

//specifies an abstract concept
//cannot be instantiated
abstract public class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
	abstract void makeNoise();
}
//overridden method eat
//signature of the base and derived methods SHOULD BE SAME
class Dog extends Animal {
	public void eat() {
		System.out.println("bow bow - eating");
	}
	public void makeNoise() {
		System.out.println("bow bow");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("meow meow - eating");
	}
	public void makeNoise() {
		System.out.println("meow meow");
	}
	
}
