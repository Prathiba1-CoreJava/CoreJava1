package Overloadedmethods.java;

public class MOL1 {

	void m1() {
		System.out.println("non-static variable m1");
	}
		int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOL1 ens = new MOL1();
		ens.m1();
		System.out.println(ens.add(2,3));
		System.out.println(ens.add(2, -1));		

	}

}
