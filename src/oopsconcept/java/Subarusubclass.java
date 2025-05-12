package oopsconcept.java;

public class Subarusubclass extends Carabstract {

	static {
		System.out.println("Static code block of subclass");
	}
	
	{
		System.out.println("nonstatic code block of subclass");
	}
	
	Subarusubclass () {
		System.out.println("constructor in subclass");
		
	}

	static void r1() {
		System.out.println("static method r1 in subclass");
	}
	
	void r2() {
		System.out.println("non-static method r2 in subclass");
	}
	
	String s = "Motor";
	
	@Override
	public void drive () {
		// TODO Auto-generated method stub
		System.out.println("method from abstract class");
	}
	

	@Override
	public int m4() {
		// TODO Auto-generated method stub
		System.out.println("abstract method m4");
		return 35;
	}
	
	@Override
	public String abc() {
	System.out.println("abstract method abc");
	return "Subaru outback abc";
	}
	
	@Override
	public void m2() {
		System.out.println("void unimplemented method from interface");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Subarusubclass obj = new Subarusubclass();

	System.out.println(obj.m1());
	obj.drive();
	obj.m2();
	System.out.println(obj.m4());
	obj.m4();
	obj.abc();
	r1();
	obj.r2();
	
	}
	}