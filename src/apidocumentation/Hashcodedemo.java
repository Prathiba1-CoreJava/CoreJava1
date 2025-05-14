package apidocumentation;

public class Hashcodedemo {

	int x = 20;
	int y = 25;
	
	@Override
	public int hashCode() {
		return x+y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Hashcodedemo obj = new Hashcodedemo();
	
		System.out.println(obj.hashCode());
	}
		
	}


