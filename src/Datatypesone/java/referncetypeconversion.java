package Datatypesone.java;

public class referncetypeconversion {

	public static void main (String[] args) {
	
		Object obj1 = new Object();
		Object obj2 = new A();
		Object obj3 = new B();
		Object obj4 = new C();
		Object obj5 = new D();
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		
		B b1 = new C();
		B b2 = new B();
		
		C c1 = new C();
				
		
		A a = new B(); //upcasting
		B b = (B) a; //downcasting
		
		A a11 = new A();
		C c10 = (C) a11;//downcasting
		
		Object obj6 = new A();
				B b21 = (B) a11;//downcasting
				
		if(obj6 instanceof A) {
		}
		
		
		
		
		
	}	
		
}


class A {}
class B extends A {}
class C extends B {}
class D {}
}