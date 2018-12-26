package studentCode;
import java.awt.Color;

import cmsc131_squareGridTools.SquareGrid;


public class OperatorMaker {
	/* *************************************************
	 * Draws a single Operator into the already created grid
	 * that is passed as the first parameter to the drawOp
	 * method according to the symbol selection passed as the 
	 * second parameter.
	 * 
	 * It accomplishes this by calling the appropriate
	 * helper method and passing the grid into that.	
	 * 
	 * All of the methods are static and have a parameter of
	 * type SquareGrid.
	 * 
	 * Each method can determine how "big" the operator is
	 * by making use of grid.getHt() to find out the size
	 * of the SquareGrid that was passed in.
	 * *************************************************/

	
	public static void drawOp(SquareGrid grid, int symbol) {
		//Your code here will essentially be a chain of if-else statements
		//  that call the appropriate helper and pass in grid.
		if(symbol==1){
			helperMinus(grid);
		}
		else if(symbol==2){
			helperPlus(grid);
			
		}
		else if(symbol==3){
			helperDivide(grid);
			
		}
		else if(symbol==4){
			helperMultiply(grid);
			
		}


 }
	
	
	
	

	/*
	 * The helper methods you need to write are indicated below.
	 * 
	 * You may add more helper methods if you want, but they 
	 * all need to be static as well.	
	 * 
	 * You will be using for loops here but you should also
	 * think about how one helper method might be able to make
	 * use of calling other helper methods that you have written.
	 * 
	 * In addition to the getHt() method, you'll be using the setColor
	 * method.  The way you'll use this will appear similar to
	 *    grid.setColor(row, column, Color.BLUE);
     * where you'll indicate the correct row and column and this 
     * line of code would then set that position in the grid to be
     * the color blue.
     * 
	 * Start by implementing the minus helper and testing that on
	 * your computer and on the submit server, then move on to each 
	 * remaining symbol in turn.
	 * 
	 * To run the program on your computer, you'll need to open the
	 * ExampleDriver.java file and run from there.  You do not change
	 * that file in any way.  All changes are done in this file.
	 * 
	 */
	
	private static void helperMinus(SquareGrid grid){
		int height=grid.getHt();
		int width=grid.getWd();
		int row=height/2;
				for(int column=0;column<width;column++){
					grid.setColor(row, column, Color.BLUE);
					
				}

		

	}

	private static void helperPlus(SquareGrid grid){
		helperMinus(grid);
		for(int i=0;i<grid.getHt();i++){
			grid.setColor(i, grid.getHt()/2, Color.BLUE);
		}
	}

	private static void helperDivide(SquareGrid grid){
		for(int i=0;i<grid.getHt();i++)
			grid.setColor(i, (grid.getHt()-1-i), Color.BLUE);

	}

	private static void helperMultiply(SquareGrid grid){
		helperPlus(grid);
		helperDivide(grid);
		for(int i=0;i<grid.getHt();i++)
			grid.setColor(i, i, Color.BLUE);
		    

	}

	
}

