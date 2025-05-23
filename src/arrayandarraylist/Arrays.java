package arrayandarraylist;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 10;
		Arrays main = new Arrays();
		main.displayValue(value);
		
		int[] numbers = {0,101,232,3,4};
		
		numbers = new int[4];//initializing array
		
		System.out.println(numbers[1]);
		
		String[] names = {"pra", "thi", "ba", "water", "float f"};
		
		for(String xyz: names) 
		//foreach syntax - (datatype temporary variable: complex object)
		
		{	
			System.out.println(xyz);
		}
		
		void displayValue (int value) {
			System.out.println("call by value - value of variable in the method: " +value);
			value = 20;
			System.out.println("call by value - value of variable in the method: " +value);
		}
		
		
	}

}
