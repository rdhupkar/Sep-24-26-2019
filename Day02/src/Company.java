public class Company {
	private String name;
	private long employeeCount;
	
	
	//getter setter methods
	public String getName() {
		return name;
	}
	
	public long getEmployeeCount() {
		return employeeCount;
	}
	
	public void setEmployeeCount(int value) {
		if(value < 1) {
			System.out.println("Invalid employee count");
		}
		else {
			employeeCount = value;	
		}
		
	}
	
	
	Company(String theName) {
		name = theName;
	}
	
	String getDetails() {
		String info = "Company " + name + " registered with IGS, 2019";
		return info;
	}
	
}
