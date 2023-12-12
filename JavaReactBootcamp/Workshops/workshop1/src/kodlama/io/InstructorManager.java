package kodlama.io;

public class InstructorManager {

    public void addToInstructor(Instructor instructor) {
        System.out.println("Eğitmen eklendi : " + instructor.getName());
    }

    public void updateToInstructor(Instructor instructor) {
        System.out.println("Eğitmen güncellendi : " + instructor.getName());
    }

    public void deleteToInstructor(Instructor instructor) {
        System.out.println("Eğitmen silindi : " + instructor.getName());
    }
}
