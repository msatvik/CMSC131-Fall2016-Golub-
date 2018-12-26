package studentCode;

import java.util.Scanner;

import cmsc131_GridTools.Grid_1x2;
/**
 *  THIS CLASS IS PROVDED FOR YOU - YOU SHOULD NOT MAKE ANY
 *  CHANGES TO THIS FILE AT ALL.  USE IT TO TEST EACH FLAG
 *  AS YOU WORK ON IT.
 *   
 *  This driver relies on the "drawFlag" method of the "FlagMaker"
 *  class.  It prompts the user to enter information about what flag
 *  he/she would like to see and in what size.  
 *  Then it creates a Grid_1x2 (of the appropriate size), and calls
 *  the drawFrag method of the FlagMaker class to actually draw
 *  the flag.
 */
public class ExampleDriver {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* Get input from user about what flag to draw */
		System.out.println("Type the number corresponding to the name:  ");
		System.out.println("0 Sultanate of Muscat");
		System.out.println("1 Somalia");
		System.out.println("2 Canton of Ticino");
		System.out.println("3 Prague");
		System.out.println("4 France");
		System.out.println("5 Senegal");
		System.out.println("6 Bahamas");
		System.out.println("7 Leonardopolis");
		System.out.print("Your choice here:");
		int choice = scanner.nextInt();
		System.out.print("Choose a size (4 or larger): ");
		int size = scanner.nextInt();
		if (size < 4 || size >30){
			size = 4;
			choice = 99;
		}
		
		/* Create drawing grid of the height requested */
		Grid_1x2 grid = new Grid_1x2(size);

		/* Draw the letter on the grid */
		FlagMaker.drawFlag(grid, choice);
		
		
		scanner.close();
	}
}
