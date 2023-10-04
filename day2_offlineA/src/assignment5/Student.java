package assignment5;

public class Student {
	int studentId;
	char studentType;
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
	Student(){
		this.studentId = 10;
		this.studentType = 'F';
	}
}
