public class PointerQueue implements PersonQueue {
  private Person head;
  private Person last;

  public void PointerQueue() {
  head = null;
  last = null;
  }

	public void insert(Person person) {
	  
	if (head == null) {
	head = person;
	} 
	
	else {
			last.setNext(person);
	}
	
	last = person;
    }

//mblablala

public Person retrieve() {
		if (head==null) {
			System.out.println("It's empty");
			return null;
		} 
Person temp = head;
		head = head.getNext();
		return temp;
	}
	


	public boolean isEmpty() {
	  if (head == null) {
		return true;
	  }  else {
		return false;
	     }
	 }


} 
