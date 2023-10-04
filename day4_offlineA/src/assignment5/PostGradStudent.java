package assignment5;

public class PostGradStudent extends Student5 {
    protected int postCourseId;
    protected String postCourseName;
    protected int postCourseFees;

//    public PostGradStudent(){
//        super();
//    }
//
//    public PostGradStudent(int postCourseId, String postCourseName, int postCourseFees) {
//        this.postCourseId = postCourseId;
//        this.postCourseName = postCourseName;
//        this.postCourseFees = postCourseFees;
//    }

    public PostGradStudent(int studentId, char studentType, String studentName, int postCourseId, String postCourseName, int postCourseFees) {
        super(studentId, studentType, studentName);
        this.postCourseId = postCourseId;
        this.postCourseName = postCourseName;
        this.postCourseFees = postCourseFees;
    }

    public int getPostCourseId() {
        return postCourseId;
    }

    public String getPostCourseName() {
        return postCourseName;
    }
}
