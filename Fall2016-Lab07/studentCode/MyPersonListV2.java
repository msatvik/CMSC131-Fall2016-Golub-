package studentCode;


public class MyPersonListV2 {
	//DO NOT CHANGE THIS LINE OF CODE
	Person[] people;

	
	
	/**
	 * Instantiates the "people" variable as a new (0-length) array of
	 * references to Person objects.
	 */
	public MyPersonListV2(){
		people=new Person[0];

	}
	
	/**
	 * A copy constructor which makes the right kind of copy considering
	 * a Person is mutable.
	 */
	public MyPersonListV2(MyPersonListV2 other) {
		people=new Person[people.length];
		if(other.people.length!=0){
			for(int i=0;i<people.length;i++){
			people[i]=new Person(other.people[i]);
			}
		}
	}
	
	
	/** Adds the parameter to the end of the list.  You'll need to
	 *  create a new array that's one space longer and you'll need
	 *  to copy everything from the old array into the new one, and
	 *  then add the new one of course.  
	 *  
	 *  Note that you want to make sure that you don't just do a reference
	 *  copy of the Person since it is mutable.
	 */
	public void addItem(Person newMember){	
		Person [] peopletemp;
		peopletemp=new Person[people.length+1];
		Person newed=new Person(newMember);
		for(int i=0;i<people.length;i++){
			peopletemp[i]=people[i];
	}
		peopletemp[people.length]=newed;
		people=peopletemp;
	}
	/** Gives each person in the list a raise of $1000
	 */
	public void giveRaises(){
		for(int i=0;i<people.length;i++){
			people[i].acceptRaise(1000);
		}
	}
	
	
	/** Returns the sum of the salaries of all people in the list.
	 */
	public int getTotalOfSalaries(){
		int tsalary=0;
		for(Person temp: people){
			tsalary+=temp.getSalary();
		}
		return tsalary;
	}

	/** Returns the number of people in the list with a name
	 *  that matches the parameter (possibly 0).
	 */
	/**
	 * @param searchName
	 * @return
	 */
	public int count(String searchName){
		int total=0;
		for(Person temp: people){
			if((temp.getName()).equals(searchName)){
				total++;
			}
		}
			return total;																			
	}
	
	/** Removes ALL people from the list whose names match the parameter
	 *  (possibly more than one person).  This should "shrink" the array 
	 *  if anyone is removed.  That means you need to first find out how
	 *  many times the name appears, then allocate a new smaller array
	 *  of the right size, and then only copy the things that don't match
	 *  the name from the old array into the new one.
	 */
	public void remove(String name){
		int count=0;
		for(int i=0;i<people.length;i++){
			if((people[i].getName()).equals(name)){
				count++;
			}
		}
		Person[] peopletemp;
		peopletemp= new Person[people.length-count];
		int ans=0;
		for(int j=0;j<people.length;j++){
			if(!((people[j].getName()).equals(name))){
				peopletemp[ans]=people[j];
				ans++;
			}
		}
		people=peopletemp;
		
	}
	
}




