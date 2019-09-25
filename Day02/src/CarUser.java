
//Local variables have to be initialized
//Member variables get default values
public class CarUser {

	public static void main(String[] args) {
//		int i = 1;
//		System.out.println(i);
		
		
		Car myCar = new Car();
		myCar.color = "Black";
		myCar.model = "Tesla";
		myCar.yearOfMake = 2019;
		myCar.electric = true;
		System.out.println(myCar.model + ", " + 
					myCar.yearOfMake + ", " + 
					myCar.color + ", " + 
					myCar.electric);
	
		myCar.start();
		myCar.drive(100);
	
		Car sportsCar = new Car();
		sportsCar.color = "Yellow";
		sportsCar.model = "Ferrari";
		sportsCar.yearOfMake = 2017;
		System.out.println(sportsCar.model + ", " + 
				sportsCar.yearOfMake + ", " + 
				sportsCar.color + ", " + 
				sportsCar.electric);
		sportsCar.start();
		sportsCar.drive(200);
	}

}
