package task6;

public class Person extends Applicant{
	
	private String name;
	private int age;
	private String address = "604 Brooke Dr";
	private String city;
	private Applicant applicant;
	
	
	public Person (String name, int age, String address, String city, Applicant applicant) {
		this.name = name;
		this.city = city;
		this.age = age;
		this.address = address;
		this.applicant = applicant;
		
	}
	
	
	public String getName() {
	return name;
	}
	
	public String getAddress() {
		return address;
		}
		
	public String getCity() {
		return city;
		}
		
	public int getAge() {
		return age;
		}
		
	public Applicant getApplicant() {
		return applicant;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
