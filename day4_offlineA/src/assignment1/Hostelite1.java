package assignment1;

public class Hostelite1 extends Student1{

	private String hostelName;
	private int roomNumber;
	
	Hostelite1(){}
	
	public Hostelite1(int studentId, char studentType, String name, double feesPerMonth, String hostelName, int roomNumber) {
		super(studentId, studentType, name, feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	
	public String getHostelName() {
		return this.hostelName;
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public static void main(String[] args) {
		Hostelite1 obj = new Hostelite1(1, 'A', "Rakshit", 1000, "ABC", 123);
		System.out.println("Id: "+obj.getStudentId());
		System.out.println("Type: "+obj.getStudentType());
		System.out.println("Name: "+obj.getStudentName());
		System.out.println("Fees: "+obj.getFeesPerMonth());
		System.out.println("Hostel Name: "+obj.getHostelName());
		System.out.println("Room Number: "+obj.getRoomNumber());
	}

}
