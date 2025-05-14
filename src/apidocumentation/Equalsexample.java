package apidocumentation;

public class Equalsexample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 25;
		int b = 30;
		int c = 25;
		
		if (a==c) {
			System.out.println("a is equal to c");
		}//== this refers to variable equality
		
		Equalsexample obj = new Equalsexample();
		Equalsexample boj = new Equalsexample();
		Equalsexample obj1 = obj;
		
		System.out.println(obj == boj);
		System.out.println(obj1 == obj);
		System.out.println(boj == obj1);
		//equals() - this refers to object reference equality
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj.equals(boj));
		
		String name = obj.getClass().getName();
		
		System.out.println("getName = " +name);
		System.out.println("toString = " +obj.toString());
		System.out.println("without toString =" +obj);
	}

}
