package task6;

public class Applicant {

	
	static String ipaddress;
	static int phonenumber;
	static String email;
	
	
	public Applicant(String ipaddress, int phonenumber, String email) {
		this.ipaddress = ipaddress;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	
	
	public Applicant() {
		// TODO Auto-generated constructor stub
	}


	public String getEmail() {
		return email;
	}
		
	public int getPhonenumber() {
	return phonenumber;
		}
	
	public String getIpaddress() {
		return ipaddress;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Applicant obj1 = new Applicant();
		ipaddress = "123.456.789";
		phonenumber = 552200164;
		email = "abc@12.com";
		System.out.println(obj1.ipaddress + obj1.552200164;
		
		
		
	}

}
