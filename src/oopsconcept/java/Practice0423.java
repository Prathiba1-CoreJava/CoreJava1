package oopsconcept.java;


public class Practice0423 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 25;
		//while loop example below
		while (i<=26)
		{	
		
			System.out.println("while loop is less than 26 " + i);
		i++;
		
		}
		//if else condition example below
		if (i<20)
			System.out.println("if else condition");
		
		else 
			System.out.println("False of if else condition");
		//do while loop example below
		
		do
		{
			System.out.println("do while loop example");
	
		} while (i<=24);
		
		//for loop example below
		
		for (int y = 3; y <=7; y++) {
			System.out.println("for loop " + y);
			
			//nested loop example below
			
			for (int z = 12; z <=18; z++) {
				System.out.println("nested loop " +" "+ (z) +" "+ (z +1));
			}
			
		}
		
	}


}
