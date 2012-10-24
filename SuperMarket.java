public class SuperMarket {
  private PersonQueue supermarketQueue;

	public void addPerson (Person person) {
		supermarketQueue.insert(person);
	}
	
	public String servePerson() {
		return (supermarketQueue.retrieve()).getName();	
	}

	public static void main(String[] args) {
		SuperMarket supermarket = new SuperMarket();
		supermarket.launch();
	}

	public void launch() {
	  supermarketQueue = new PointerQueue();
		
		Person firstPerson = new Person("John", 45);
		Person secondPerson = new Person("Paul", 82);
		Person thirdPerson = new Person("Emily", 25);
	
		addPerson(firstPerson);
		addPerson(secondPerson);
		addPerson(thirdPerson);
	
	
	
	
		System.out.println(servePerson());
		System.out.println(servePerson());
		
	}
	
}
