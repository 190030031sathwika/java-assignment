package assignment2;

public class Student2 {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	Student2(){}
	
	public Student2(int studentId, char studentType, String fName, String lName) {
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = fName + " " + lName;
	}
	
	public Student2(int studentId, char studentType, String studentName, double feesPerMonth) {
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String fName, String lName) {
		this.studentName = fName + " " + lName;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
}
