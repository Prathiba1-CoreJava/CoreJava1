package practicesessions;

public class Person1 {

	private String name = "Laksh";
	private int age = 22;

	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 object1 = new Person1();
		
		System.out.println(object1.getName());
		
	}

}
