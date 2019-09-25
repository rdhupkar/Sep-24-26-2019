public class City {
	String name;
	long population;
	String state;
	String country;
	
	City() {
		
	}
	
	City(String theName) {
		name = theName;
	}
	
	City(String theName, long thePopulation) {
		name = theName;
		population = thePopulation;
	}
	
	City(long thePopulation, String theName) {
		population = thePopulation;
		name = theName;
	}
	
	City(String theName, long thePopulation, String theState) {
		name = theName;
		population = thePopulation;
		state = theState;
	}
	
	City(String theName, String theState, long thePopulation) {
		name = theName;
		state = theState;
		population = thePopulation;
	}
	
	
	
	
	
	
	
}
