package studentCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class MyPersonList implements Collection<Person> {

	//Keeping this package for easier testing...
	ArrayList<Person> people;



	/**
	 * Instantiates the "people" variable as a new ArrayList of
	 * references to Person objects.
	 */
	public MyPersonList(){
		people = new ArrayList<Person>(0);
	}

	/**
	 * A copy constructor which makes the right kind of copy considering
	 * a Person is mutable.
	 */
	public MyPersonList(MyPersonList other) {	
		this.people=new ArrayList<Person>();
		for (int i=0; i<other.people.size(); i++){
			this.people.add(other.people.get(i).copyMe());
		}
	}


	/** Adds the parameter to the end of the list.  
	 * 
	 *  Note that you want to make sure that you don't just do a reference copy
	 *  of the newMember Person since it is mutable but also you don't know
	 *  what specific type of Person it is, so you can't use a copy constructor.
	 */
	@Override
	public boolean add(Person newMember){	
		people.add(newMember.copyMe());
		return true;
	}



	/** Gives each person in the list a raise of $1000.  Note that the objects
	 *  are mutable, which means you can use a for-each style loop as you update.
	 */
	public void giveRaises(){
		for (Person currPerson : people) {
			currPerson.acceptRaise(1000);
		}
	}

	/** Returns the sum of the salaries of all people in the list.
	 */
	public int getTotalOfSalaries(){
		int total = 0;
		for (Person currPerson : people) {
			total += currPerson.getSalary();
		}
		return total;
	}

	/** Returns the number of people in the list with a name
	 *  that matches the parameter (possibly 0).
	 */
	public int count(String searchName){
		int count = 0;
		for (Person currPerson : people) {
			if (currPerson.getName().equals(searchName)) {
				count++;
			}
		}
		return count;
	}
	
	/** Returns the number of people in the list.
	 */
	@Override
	public int size() {	
		return people.size();
	}



	/** Returns whether the list is empty.
	 */
	@Override
	public boolean isEmpty() {	
		if (people.size()==0){
			return true;
		}
		else {
			return false;
		}
	}



	/** Removes ALL people from the list whose names match the parameter
	 *  (possibly more than one person).  Consider that a for-each style
	 *  loop cannot be used unless you create a shadow.  There are code
	 *  examples in the posted slides that will be useful here.
	 */
	public void remove(String name){
		ArrayList<Person> peopleShadow = new ArrayList<Person>(people);
		for (Person currPerson : peopleShadow) {
			if (currPerson.getName().equals(name)) {
				people.remove(currPerson);
			}
		}
	}


	/** Removes all people from the list.
	 */
	@Override
	public void clear() {	
		people.clear();
	}

	/** Returns a String which is a concatenation of each individual
	 *  person in the list being turned into a String.
	 */
	@Override
	public String toString() {
		String result = "";
		for (Person currPerson : people) {
			result += currPerson.toString() + "   ";
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
// ========= showing how to "pass the buck" to the ArrayList =========
	//Since the people list is an ArrayList, it already has methods to
	//   do the following ones so we show here how you could "pass the
    //   buck" to it.  We do it for these for you because there are
	//   things in the parameters we have not yet discussed, and are
	//   unlikely to until CMSC132.

	@Override
	public boolean addAll(Collection<? extends Person> otherCollection) {
		return people.addAll(otherCollection);
	}
	
	@Override
	public boolean contains(Object other) {		
		return people.contains(other);
	}

	@Override
	public boolean containsAll(Collection<?> otherCollection) {
		return people.containsAll(otherCollection);
	}
	
	@Override
	public boolean remove(Object other) {
		return people.remove(other);
	}
	
	@Override
	public boolean removeAll(Collection<?> otherCollection) {
		return people.removeAll(otherCollection);
	}
	
	@Override
	public boolean retainAll(Collection<?> otherCollection) {
		return people.retainAll(otherCollection);
	}
	
	@Override
	public Iterator<Person> iterator() {
		return people.iterator();
	}

	@Override
	public Object[] toArray() {
		return people.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return people.toArray(a);
	}

	

}
