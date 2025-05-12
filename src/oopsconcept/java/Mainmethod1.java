package oopsconcept.java;

public class Mainmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concreteclass1 obj = new Concreteclass1();
		
		String mystring = "Seven12";
		
		obj.display(mystring);
		int length = obj.getLength(mystring);
		
		System.out.println("Length of string : " + length);
	}

}
