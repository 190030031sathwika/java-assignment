package assignment5;

public class DayScholar extends PostGradStudent{
    protected String residentialAddress;

    public DayScholar(int studentId, char studentType, String studentName, int postCourseId, String postCourseName, int postCourseFees, String residentialAddress) {
        super(studentId, studentType, studentName, postCourseId, postCourseName, postCourseFees);
        this.residentialAddress = residentialAddress;
    }

    public int calculateFees() {
        return this.postCourseFees/6;
    }

    public int getFees() {
        return this.calculateFees();
    }
}
