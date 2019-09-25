
public class Overloading {

	public static void main(String[] args) {
		//City city = new City(theName, theState, thePopulation);
		
		Employee houseKeeping = new Employee("23098", "Sam");
		houseKeeping.work();
		
		Employee manager = new Employee("230983", "Joe");
		manager.work(12);

	}

}
