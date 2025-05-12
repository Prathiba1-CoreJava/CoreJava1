package Datatypesone.java;

public class Static {
	
	
	static {
		System.out.println("constructor");
	}
	
	static void m1() {
		System.out.println("m1");
		m1();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		static ens = new static ();
		System.out.println();
	}

}
