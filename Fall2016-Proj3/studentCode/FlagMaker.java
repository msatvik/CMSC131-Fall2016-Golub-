package studentCode;
import java.awt.Color;

import cmsc131_GridTools.Grid_1x2;



public class FlagMaker {
	private static Color AZURE = new Color(0,127,255);
	
	//YOU SHOULD READ AND GET COMFORTABLE WITH THESE TWO METHODS
	//  AS YOUR FIRST STEP - UNDERSTAND WHAT THEY DO AND WHY
	//THINK ABOUT HOW YOU CAN WRITE YOUR DRAW AND SOME OTHER HELPER
	//  METHODS AS YOU WORK ON THE REMAINING FLAGS.
	
	private static void helperSolid(Grid_1x2 grid, Color theColor) {
		//We want to paint the whole flag this one color.  To do
		//  this we can iterate through each row, and within that
		//  row iterate through each column.  At each position, 
		//  we'll set the color there to the one passed in.
		for (int row=0; row<grid.getHt(); row++) {
			for (int col=0; col<grid.getWd(); col++) {
				grid.setColor(row, col, theColor);
			}
		}
	}
	
	private static void drawSultanateOfMuscat(Grid_1x2 grid) {
		//Since this is just a solid red flag, we'll call the
		//  helper we have to do the work.
		helperSolid(grid, Color.RED);
	}
	

	
	
	
	//THIS IS A MORE COMPLEX HELPER METHOD THAT WE PROVIDE
	//  IT DRAWS A STAR (SORT OF) IN THE CENTER OF A GRID
	//  THAT IS SENT TO IT, USING THE SPECIFIED COLOR.
	//YOU MIGHT FIND IT INTERESTING TO READ THE CODE, BUT
	//  YOU CAN USE THIS HELPER WITHOUT DOING THAT SINCE 
	//  YOU DO NO WHAT IT DOES AT THE ABSTRACT LEVEL.
	
	private static void helperCenterStar(Grid_1x2 grid, Color theColor) {
		int middleX = grid.getWd()/2;
		int middleY = grid.getHt()/2;
		
		//Do the left side of things
		for (int radius=0; radius<middleY-3; radius++) {
			//The left leg
			grid.setColor(middleY+radius, middleX-radius-1, theColor);
			grid.setColor(middleY+radius, middleX-radius, theColor);
			
			//The right leg
			grid.setColor(middleY+radius, middleX+radius-1, theColor);
			grid.setColor(middleY+radius, middleX+radius, theColor);
			
			//The arms
			grid.setColor(middleY, middleX+radius, theColor);
			grid.setColor(middleY, middleX-radius-1, theColor);
			
			//The head
			grid.setColor(middleY-radius, middleX-1, theColor);
			grid.setColor(middleY-radius, middleX, theColor);
		} 
	}

	
	

	/* Draws a single flag as indicated by the second parameter
	 * into the grid passed as the first parameter.  We provide 
	 * the starter code here that will correctly call the helper
	 * to draw the flag of ????.  As you work on the flag for each
	 * task, you'll need to (a) modify this method to add the 
	 * option, and (b) write the helper method(s) that it calls.
	 */
	public static void drawFlag(Grid_1x2 grid, int flagCode) {
		//Our first flag is that of the Sultanate of Muscat
		//so our condition has:
		//   - a check for that flag's code, 0
		//   - a check to make sure the height of the grid
		//      passed in is odd
		//   - a check to make sure the height of the grid
		//      passed in is at least 9
		if (flagCode==0 && grid.getHt()%2==1 && grid.getHt()>=9) {
			drawSultanateOfMuscat(grid);
		}
		else if (flagCode==1 && grid.getHt()%2==1 && grid.getHt()>=9) {
			drawSomalia(grid);	
		}
			else if(flagCode==2 && grid.getHt()%2==0){
				drawCantonofTicino(grid);	
			}
			else if(flagCode==3 && grid.getHt()%2==0){
				drawPrague(grid);	
			}
			else if(flagCode==4 && grid.getHt()%3==0){
				drawFrance(grid);	
			}
			else if(flagCode==5 && grid.getWd()%3==0 &&  grid.getHt()%2==1 && grid.getHt()>=9 ){
				drawSenegal(grid);	
			}
		
		else if (flagCode==6 && grid.getHt()%3==0) {
			drawBahamas(grid);
		}
		else if (flagCode==7 && grid.getHt()%2==1 && grid.getHt()>8) {
			drawLeonardopolis(grid);
		}

		
		//ADD THE TESTS/FILTERS FOR EACH ADDITIONAL FLAG HERE
		//  AS YOU IMPLEMENT THE TASKS
		


		
		
		
		
		//THE LAST "ELSE" IN THE CHAIN SHOULD CALL THE ERROR FLAG
		else{
			drawError(grid);
		}
	}
	
	
	
	//YOUR FIRST TASK'S DRAW METHOD HERE - WE'VE PROVIDED THE
	//  SIGNATURE TO POINT YOU IN THE RIGHT DIRECTION
	private static void drawError(Grid_1x2 grid){
       //YOUR CODE HERE
		int height=grid.getHt();
		int width=grid.getWd();
		grid.setColor(0, 0, Color.RED);
		grid.setColor(0, (width-1), Color.RED);
		grid.setColor((height-1),(width-1) , Color.RED);
		grid.setColor((height-1),0 , Color.RED);
	}
	//THE DRAW METHODS AND ANY HELPERS YOU WRITE FOR THE REMAINING 
	//  TASKS GET ADDED BY YOU DOWN HERE AS YOU GO...
	
	

	private static void helperPaint_Sunrays( grid, Color theColor){
		int height=grid.getHt();
		int width=grid.getWd();
		for(int row=0;row<height;row++){
			//draw \ sign
			grid.setColor(row, 2*row, theColor);
			grid.setColor(row, 2*row+1, theColor);
			// draw / sign 
			grid.setColor(row, width-2*row-2, theColor);
			grid.setColor(row, width-2*row-1, theColor);
			
			grid.setColor(row, width/2, theColor);
			grid.setColor(row, width/2-1, theColor);
			
			if(row==height/2){
				for(int col=0;col<width;col++){
					grid.setColor(height/2, col, theColor);
					
				}
			}
		}
		    

	}
	private static void helperPaint_Triangle(Grid_1x2 grid, Color theColor){
		int height=grid.getHt();
		
		for(int row=0; row<height/2;row++){
			for(int col=0;col<=row;col++){
				grid.setColor(row, col, theColor);
			}
		}
		for(int row=height/2;row<=height-1;row++){
			for(int col=0;col<=(height-1)-row;col++){
				grid.setColor(row, col, theColor);
			}
		}
	}
			private static void drawSomalia(Grid_1x2 grid) {
				
				for (int row=0; row<grid.getHt(); row++) {
					for (int col=0; col<grid.getWd(); col++) {
						grid.setColor(row,col,Color.BLUE);
						
					}
				}
				helperCenterStar(grid,Color.WHITE);
			}
			
			private static void drawCantonofTicino(Grid_1x2 grid){
				
				for (int row=0; row<grid.getHt(); row++) {
					for (int col=0; col<grid.getWd(); col++) {
						grid.setColor(row,col,Color.CYAN);
						grid.setColor(row/2,col,Color.PINK);
						
			}
				}
			}
			private static void drawPrague(Grid_1x2 grid){
				
				for (int row=0; row<grid.getHt(); row++) {
					for (int col=0; col<grid.getWd(); col++) {
						grid.setColor(row,col,Color.RED);
						grid.setColor(row/2,col,Color.YELLOW);
						
			}
				}
			}
			private static void drawFrance(Grid_1x2 grid){
				for (int row=0; row<grid.getHt(); row++) {
					for (int col=0; col<grid.getWd(); col++) {
						grid.setColor(row,col,Color.RED);
						grid.setColor(row,col/3,Color.BLUE);
						grid.setColor(row,2*col/3,Color.WHITE);
						
			}
				}
			}
			private static void drawSenegal(Grid_1x2 grid){
				int height=grid.getHt();
				int width=grid.getWd();
				for (int row=0; row<height; row++) {
					for (int col=0; col<width; col++) {
						grid.setColor(row,col,Color.RED);
						grid.setColor(row,col/3,Color.GREEN);
						grid.setColor(row,2*col/3,Color.YELLOW);			
			}
				}
				helperCenterStar(grid,Color.GREEN);
			}
			private static void drawBahamas(Grid_1x2 grid){
				for (int row=0; row<grid.getHt(); row++) {
					for (int col=0; col<grid.getWd(); col++) {
						grid.setColor(row,col,Color.CYAN);
						grid.setColor(row/3,col,Color.CYAN);
						grid.setColor(2*row/3,col,Color.YELLOW);
						helperPaint_Triangle(grid,Color.BLACK);
						
			}
				}
				
			}
			private static void drawLeonardopolis(Grid_1x2 grid){
				helperSolid(grid,AZURE);
				helperPaint_Sunrays(grid,Color.YELLOW);
	
	}
}

	

