package apidocumentation;

public class Getclass {

	int x = 23;
	int y = 23;
	String Z = "Dog";
	double abc = 33.96;
	short dd = 256;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Getclass upper = new Getclass();
		Class<? extends Getclass> output = upper.getClass();
		
		System.out.println("upper is the obj = " +upper.getName()  );
		
		
	}


	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
