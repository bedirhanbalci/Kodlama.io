package kodlama.io;

public class Instructor extends User {

    private String instructorNumber;

    private String courseCode;


    public Instructor() {
    }

    public Instructor(int id, String name, String surname, String email, String password, String courseName, String instructorNumber, String courseCode) {
        super(id, name, surname, email, password, courseName);
        this.instructorNumber = instructorNumber;
        this.courseCode = courseCode;
    }


    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
