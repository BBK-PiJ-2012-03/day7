public class PointerQueue implements PersonQueue {
  private Person head;

  public void PointerQueue() {
  head = null;
  }

	public void insert(Person person) {
	  
	if (head != null) {
	  
	head = person;
	} else {
			Person current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(person);
		}


//mblablala
public Person retrieve() {
		if (head==null) {
			System.out.println("EMPTY QUEUE!");
			return null;
		} 
Person temp = head;
		head = head.getNextPerson();
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
