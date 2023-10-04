package assignment8;

public class Student38 {

	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
	Student38() {}
	
	
 	public Student38(int studentId, char StudentType, String fName, String lName) {
		super();
		this.studentId = studentId;
		this.studentName = fName + " " + lName;
		this.studentType = studentType;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String fName, String lName) {
		this.studentName = fName + " " + lName;
	}


	public String getResidentialStatus() {
		return residentialStatus;
	}


	public void setResidentalStatus(String status) {
		this.residentialStatus = status;
	}


	public double getFees() {
		return this.feesPerMonth;
	}
	
	public void setFees(long fees) {
		this.feesPerMonth = fees;
	}
	
	public void calculateFees(double semesterFees) {
		this.feesPerMonth = semesterFees / 6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		this.feesPerMonth = semesterFees / 6.0;
		this.feesPerMonth += hostelFees;
	}


	public static void main(String[] args) {
		Student38 student = new Student38(1, 'A', "sathwika", "aitha");
		student.setResidentalStatus("Hostelite");
		if(student.getResidentialStatus().equalsIgnoreCase("Day Scholar"))
			student.calculateFees(1000.0);
		else student.calculateFees(10000.0, 2000.19);
		
		System.out.println("Name: "+student.getStudentName());
		System.out.println("Id: "+student.getStudentId());
		System.out.println("Resisential Status: "+student.getResidentialStatus());
		System.out.println("Fees: "+student.getFees());
	}

}
