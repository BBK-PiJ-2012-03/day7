public class Person {
String name;
int age;
Person nextPerson;

 public Person (String name, int age) {
  this.name = name;
  this.age = age;
  this.nextPerson = null;
  }

	public String getName() {
	return name;
	}

	public int getAge() {
	return age;
	}

	public void setName(String name) {
	this.name = name;
	}

	public void setAge(int age) {
	this.age = age;
	}

	public void setNext(Person person) {
	this.nextPerson = person; 
	}
	public Person getNext() {
		return nextPerson;
	}
}