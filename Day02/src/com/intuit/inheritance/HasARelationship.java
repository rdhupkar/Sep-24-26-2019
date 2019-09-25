package com.intuit.inheritance;

public class HasARelationship {

	public static void main(String[] args) {
		
		TrainingRoom eden = new TrainingRoom();
		
		Car santro = new Car("Santro");
		Person sam = new Person();
		
		sam.setName("Sam");
		sam.setAge(25);
		sam.setCar(santro);
		
		System.out.println(santro);
		System.out.println(sam.getCar());
	}

}
