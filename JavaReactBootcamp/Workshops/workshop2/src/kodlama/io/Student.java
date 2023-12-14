package kodlama.io;

public class Student extends User {

    private String studentNumber;

    public Student() {
    }

    public Student(int id, String name, String surname, String email, String password, String courseName, String studentNumber) {
        super(id, name, surname, email, password, courseName);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
