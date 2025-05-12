package oopsconcept.java;

public class Example0422 {
	
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
		this.age = age;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example0422 Person = new Example0422();
Person.setName("Laksh");
Person.setAge(-2);
		
System.out.println("Name:" + Person.getName());
System.out.println("Age:" + Person.getAge());

		
	}

}
