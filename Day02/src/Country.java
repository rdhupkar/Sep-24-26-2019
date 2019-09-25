public class Country {
	private String name;
	private String capital;
	private long population;
	
	public Country() {
	}
	
	public Country(String theName) {
		name = theName;
	}
	

	public Country(String theName, String theCapital, long thePopulation) {
		name = theName;
		capital = theCapital;
		population = thePopulation;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
}
