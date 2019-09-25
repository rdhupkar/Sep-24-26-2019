package com.intuit.inheritance;

//is-a or is-kind of relationship
//Employee is the base or super class
//Manager is the derived or sub class
public class Employee {
	private int id;
	public Employee(int theId) {
		id = theId;
	}
	public int getId() {
		return id;
	}
	
	public void work() {
		System.out.println("Employee " + id + " is working");
	}
}
//a derived class constructor should have a call to the base class constructor
class Manager extends Employee {
	private int level;
	public Manager(int theId, int theLevel) {
		super(theId);
		level = theLevel;
	}
	public void work() {
		System.out.println("Manager is workgin");
	}
}
class VP extends Manager {
	private int stockOptions;
	public VP(int id, int level, int theStockOptions) {
		super(id, level);
	}
	public void work() {
		System.out.println("VP is working");
	}
}










