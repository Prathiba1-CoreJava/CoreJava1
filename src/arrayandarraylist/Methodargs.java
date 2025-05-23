package arrayandarraylist;

public class Methodargs {

	
	//call by value in java example
	//call by value in java example
	//call by value in java example
	//call by value in java example
	//call by value in java example
	//displayValue is the name of the method
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 10;//value creation
	Methodargs main = new Methodargs();//object initialization
	main.displayValue(value);//calling displayvalue method by using object
		
	}

	
	
	void displayValue(int value) 
	
	
	{
		System.out.println("value of variable in the method displayValue:" + value);
		value = 20;
	}
	
}
