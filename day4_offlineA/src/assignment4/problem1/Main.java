package assignment4.problem1;

class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;

	Student() {
		
	}

	Student(int studentId, char studentType, String studName, int semFees, int feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studName;
		this.semesterFees = semFees;
		this.feesPerMonth = feesPerMonth;
	}

	void displayDetails() {
		System.out.println(this.studentId + " " + this.studentType + " " + this.studentName + " " + this.semesterFees
				 + " " + this.feesPerMonth);
	}
}

class DayScholar extends Student {
	private String residentialAddress;

	DayScholar(int studentId,char studentType ,String studName,int semFees, int feesPerMonth, String residentialAddress){ 
		super(studentId, studentType,studName,semFees, feesPerMonth); 
		this.residentialAddress=residentialAddress;
	}

	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println(" " + this.residentialAddress);
	}
}

class CourseReg {
	public static void main(String args[]) {
		DayScholar dayscholar = new DayScholar(1001, 'A', "aitha", 12000, 1000, "No 4-4-600 Vijayanagar");
		dayscholar.displayDetails();
	}
}
