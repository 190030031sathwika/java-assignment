package assignment7;

class Student7 {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees = 12000;
	protected int feesPerMonth;

	public Student7() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student7(int studentId, char studentType, String studentName, int feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
	}

	public void setStudentId(int sId) {
		this.studentId = sId;
	}

	
	public void setStudentType(char sType) {
		this.studentType = sType;
	}

	public void setStudentName(String sName) {
		this.studentName = sName;
	}

	public void getDetails() {
		System.out.println("Student ID :" + studentId);
		System.out.println("Student Type :" + studentType);
	}
	
	public void calculateFees() {
		this.feesPerMonth = semesterFees/6;
	}
	
	public final void displayDetail() {
		
	}
}

final class DayScholar extends Student7 {
	private String residentialAddress;

	public DayScholar() {
		
	}
	
	

	public DayScholar(int studentId, char studentType, String studentName, int feesPerMonth, String residentialAddress) {
		super(studentId, studentType, studentName, feesPerMonth);
		this.residentialAddress = residentialAddress;
	}



	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}

	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name " + studentName);
		System.out.println("Residential Address" + residentialAddress);
	}
	
	public void displayDaySDetails() {
		System.out.println(this.studentId + " " + this.studentName + " " + this.studentType + " " + this.feesPerMonth + " "
				+ this.residentialAddress);
	}
}

class DynamicEx {
	public static void main(String args[]) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('A');
		dayScholar.setStudentName("Sathwika");
		dayScholar.setResAddress("NO 4-4-600 Vijyanagar");
		dayScholar.calculateFees();
		dayScholar.displayDaySDetails();
	}
}
