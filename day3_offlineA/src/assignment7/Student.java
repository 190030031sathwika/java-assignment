package assignment7;

public class Student {

	private int studentId;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	
	Student() {}
	
	
 	public Student(int studentId, String studentName, String residentialStatus, long feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.residentialStatus = residentialStatus;
		this.feesPerMonth = feesPerMonth;
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


	public void setResidentalStatus(String residentalStatus) {
		this.residentialStatus = residentalStatus;
	}


	public long getFees() {
		return feesPerMonth;
	}
	
	public void setFees(long fees) {
		this.feesPerMonth = fees;
	}


	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName(args[1], args[2]);
		student.setResidentalStatus(args[3]);
		if(student.getResidentialStatus().equals("Hostelite"))
			student.setFees(Long.parseLong(args[4])+Long.parseLong(args[5]));
		else student.setFees(Long.parseLong(args[4]));
		
		System.out.println("Name: "+student.getStudentName());
		System.out.println("Id: "+student.getStudentId());
		System.out.println("Resisential Status: "+student.getResidentialStatus());
		System.out.println("Fees: "+student.getFees());
	}

}
