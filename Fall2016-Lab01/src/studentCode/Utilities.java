package studentCode;

public class Utilities {
		//Do not modify these two lines.  They define fields
	    //   and provide default values (which may or may not
	    //   be what the logic of the project really needs, but
	    //   any changes you make will be down within the methods.
	    static private int count=999;
	    static private boolean readyToPenny=true;
	    
	    
	    
	    //Do not modify any of the method names or existing code.
	    //  Only add a line of code to accomplish the specified task
	    //  in each of the four indicated locations.
	    
	    static public String getName() {
	    	//Change what's between the quotes so it is your name.
	    	return "Satvik Mittal";
	    }
	
	    

	    
	    static public void initCount() {
	    	//Add a line of code here that will cause the
	    	//  field called count to be assigned 0.
count=0;

	    	
	    }
	    
	    static public int getCount() {
	    	//Do not alter this code at all.
	        return count;
	    }
	    
	    static public void knockHappened() {
	    	//Add a line of code here that will cause the
	    	//  field called count to increase by 1.
        count++;	
        System.out.println("The value of count"+count);
	    }
	    	    	    
	    static public void initPenny() {
	    	//Add a line of code here that will cause the
	    	//  field called readyToPenny to store false.
	    	readyToPenny= false;
	    	
       }
	    
	    static public boolean getPennyStatus() {
	    	//Do not alter this code at all.
	        return readyToPenny;
	    }
	    
	    static public void togglePenny() {
	    	//Do not alter this code at all.
	        readyToPenny=!readyToPenny;
	    }

	
}
