package com.intuit.inheritance;

public class IsARelationship {

	public static void main(String[] args) {
		
		VP sam = new VP(10, 20, 932847);
		
		
		Employee e1 = new Employee(101);
		e1.work();
		Manager m1 = new Manager(102, 10);
		m1.work();
	}

}
