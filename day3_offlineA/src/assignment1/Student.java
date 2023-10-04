package assignment1;

public class Student {
	static int studentCount;
	private int studentId;
	private char studentType;
	private String studentName;
	
	static {
		studentCount = 10;
	}
	
	public Student() {
		this.studentId = studentCount++;
	}
	
	public Student(char studentType, String fname, String lname) {
		super();
		this.studentType = studentType;
		this.studentName = fname + " " + lname;
		this.studentId = studentCount++;
	}
	
	public static int getStudentCount() {
		return studentCount;
	}
	
	public void displayDetails(Student obj) {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student type: "+this.studentType);
		System.out.println("Student Name: "+this.studentName);
	}

	public static void main(String[] args) {
		Student studentOne = new Student('A', "Sathwika", "Aitha");
		studentOne.displayDetails(studentOne);
		
		Student studentTwo = new Student('B', "Aitha", "Sathwika");
		studentTwo.displayDetails(studentTwo);

	}
}
