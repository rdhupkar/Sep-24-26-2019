
public class AccessSpecifiers {

	public static void main(String[] args) {
		Company intuit = new Company("Intuit");
		//intuit.name = "IBM";
		//String nameOfTheCompany = intuit.name;
		String nameOfTheCompany = intuit.getName();
		System.out.println(nameOfTheCompany);
		System.out.println(intuit.getDetails());
		
		intuit.setEmployeeCount(-100);
		System.out.println(intuit.getEmployeeCount());
		
//		intuit.employeeCount = -100;
//		System.out.println(intuit.employeeCount);
	}

}
