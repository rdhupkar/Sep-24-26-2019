//An object is created on the heap
//You have a reference to that object in Stack
//sam is a reference to a Person object
//ram is a reference to a Person object

public class PersonUser {

	public static void main(String[] args) {
		Person sam = new Person();
		sam.eat("Rice");
		sam.sleep(12);
		System.out.println(sam);
		
		Person ram = new Person();
		Person mary = new Person();
		System.out.println(ram);
		System.out.println(mary);
		for(int i=0;i < 100; i++) {
			Person person = new Person();
			System.out.println(person);
		}
	}

}
