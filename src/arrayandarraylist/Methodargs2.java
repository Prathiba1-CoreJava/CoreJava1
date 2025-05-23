package arrayandarraylist;

public class Methodargs2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] name = {"water", "fire", "land", "air", "Earth"};
		
		System.out.println(name [0]);//this was printed first
		
		Methodargs2 obj2 = new Methodargs2();
		
		obj2.displayvalue(name);
		
		System.out.println(name[2]);//this printed last it was created last
		
	}//main method ends here
	

	//This is outside of main method
	void displayvalue(String[] name)
	{
		System.out.println(name[2]);//this is printed 2nd
		name[2] = "Space";
	System.out.println(name[2]);//this is printed 3rd as it was created after..
								//..the [2] new value was created
	
	System.out.println(name[3]);//This printed 4th as it was created next
	}
	
	}


