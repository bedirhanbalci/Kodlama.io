package kodlama.io;

public class CourseManager {

    public void addToCourse(Course course) {
        System.out.println("Kurs eklendi : " + course.getName());
    }

    public void updateToCourse(Course course) {
        System.out.println("Kurs güncellendi : " + course.getName());
    }

    public void deleteToCourse(Course course) {
        System.out.println("Kurs silindi : " + course.getName());
    }
}
