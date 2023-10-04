package assignment4.problem2;

class CourseRegistration {
	protected static int regId;
	protected String courseName;

	CourseRegistration() {
		regId++;
	}

	CourseRegistration(String cName) {
		this.courseName = cName;
	}

	public void displayDetails() {
		System.out.println("Registration ID :" + this.regId);
		System.out.println("CourseName :" + this.courseName);
	}
}
class Student extends CourseRegistration {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;

	Student(String cName){ 
		super(cName); 
	}
	
	Student() {
		super();
	}

	Student(int studentId,char studentType,String studName,int semFees, int feesPerMonth,String cName){
		super(cName); 
		this.feesPerMonth=feesPerMonth;
		this.studentType=studentType;
		this.studentId=studentId;
		this.studentName=studName; 
		this.semesterFees=semFees; 
	}
}

class DayScholar extends Student {
	private String residentialAddress;

	DayScholar(int studentId, char studentType, String studName, int semFees, int feesPerMonth, String residentialAddress,
			String cName) {
		super(studentId, studentType, studName, semFees, feesPerMonth, cName);
		this.residentialAddress = residentialAddress;
	}

	@Override
	public void displayDetails() { 
		// need to display the Details of the Student and //DayScholar
		super.displayDetails();
		System.out.println("Student ID: " + this.studentId);
		System.out.println("Student Type: " + this.studentType);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Semester Fees: " + this.semesterFees);
		System.out.println("Fees per month: " + this.feesPerMonth);
		System.out.println("Residential Address: " + this.residentialAddress);
	}
}

class CourseReg {
	public static void main(String args[]){ 
		DayScholar dayscholar = new DayScholar (1001, 'A', "aitha", 12000, 1000, "No 4-4-600 Vijayanagar","00P"); 
		dayscholar.displayDetails(); 
	}

}