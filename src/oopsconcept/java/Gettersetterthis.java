package oopsconcept.java;

public class Gettersetterthis {

	String engine;
	String wheels;
	int price;
	
	
 public Gettersetterthis () {
	 
 }
 
 Gettersetterthis (String engine, String wheels, int price) {
		this.engine = engine;
		this.wheels = wheels;
		this.price = price;
		
		
	}

public static void main(String args[]) {
	
	Gettersetterthis obj = new Gettersetterthis (obj.engine, obj.wheels, obj.price);
	
	/*
	 * obj.engine = Subaru(); obj.wheels = Bridgesport (); obj.price = 40000 ();
	 */
	System.out.println(obj.engine);

}
}
