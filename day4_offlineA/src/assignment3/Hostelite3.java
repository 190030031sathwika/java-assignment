package assignment3;

public class Hostelite3 extends Student3{

	private String hostelName;
	private int roomNumber;
	
	Hostelite3(){}
	
	public Hostelite3(int studentId, char studentType, String name, double feesPerMonth, String hostelName, int roomNumber) {
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
	
	@Override
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Hostel Name: "+this.hostelName);
		System.out.println("Room Number: "+this.roomNumber);
	}

}
