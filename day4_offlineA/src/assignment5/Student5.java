package assignment5;

public class Student5 {
    private static int currentStudentID;
    protected int studentId;
    protected char studentType;
    protected String studentName;

    public Student5() {
        super();
        this.studentId=++currentStudentID;
    }

    public Student5(int studentId, char studentType, String studentName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = studentName;
    }
}

