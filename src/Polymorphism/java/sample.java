package Polymorphism.java;

public class sample extends example{

	static void m1() {
		System.out.println("sample m1");
	}
	
	void m2() {
		System.out.println("sample m2");
	}
	
	void m3(String s) {
		System.out.println("sample m3 method "+ s);
	}
	
	public static void main(String[] args) {
		sample s = new sample();
	    m1();
		s.m2();
		s.m3();
		s.m3("DZT");
		
		example e = new sample();
		m1();
		e.m2();
		e.m3();
		e.m4();
		
	}
}
