package kodlama.io;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "JavaScript", "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)");
        Course course2 = new Course(2, "Python", "(2023) Yazılım Geliştirici Yetiştirme Kampı (Python & Selenium)");
        Course course3 = new Course(3, "JAVA", "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");
        Course course4 = new Course(4, "C# + ANGULAR", "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
        Course course5 = new Course(5, "JAVA + REACT", "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        Course course6 = new Course(6, ".NET", "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)");
        Course course7 = new Course(7, "Temel Programlama", "Programlamaya Giriş için Temel Kurs");

        Category category1 = new Category(1, "Programlama");
        Category category2 = new Category(2, "Tümü");

        Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
        Instructor instructor2 = new Instructor(2, "Halit Enes Kalaycı");
        Instructor instructor3 = new Instructor(3, "Tümü");

        Course[] courses = {course1, course2, course3, course4, course5, course6, course7};
        for (Course course : courses) {
            System.out.println("Kurs : " + course.getName());
        }

        Category[] categories = {category1, category2};
        for (Category category : categories) {
            System.out.println("Kategori : " + category.getName());
        }

        Instructor[] instructors = {instructor1, instructor2, instructor3};
        for (Instructor instructor : instructors) {
            System.out.println("Eğitmen : " + instructor.getName());
        }


        CourseManager courseManager = new CourseManager();
        courseManager.addToCourse(course1);
        courseManager.updateToCourse(course1);
        courseManager.deleteToCourse(course1);


        courseManager.addToCourse(course2);
        courseManager.updateToCourse(course2);
        courseManager.deleteToCourse(course2);

        courseManager.addToCourse(course3);
        courseManager.updateToCourse(course3);
        courseManager.deleteToCourse(course3);

        courseManager.addToCourse(course4);
        courseManager.updateToCourse(course4);
        courseManager.deleteToCourse(course4);

        courseManager.addToCourse(course5);
        courseManager.updateToCourse(course5);
        courseManager.deleteToCourse(course5);

        courseManager.addToCourse(course6);
        courseManager.updateToCourse(course6);
        courseManager.deleteToCourse(course6);

        courseManager.addToCourse(course7);
        courseManager.updateToCourse(course7);
        courseManager.deleteToCourse(course7);

        CategoryManager categoryManager = new CategoryManager();
        categoryManager.addToCategory(category1);
        categoryManager.updateToCategory(category1);
        categoryManager.deleteToCategory(category1);

        categoryManager.addToCategory(category2);
        categoryManager.updateToCategory(category2);
        categoryManager.deleteToCategory(category2);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addToInstructor(instructor1);
        instructorManager.updateToInstructor(instructor1);
        instructorManager.deleteToInstructor(instructor1);

        instructorManager.addToInstructor(instructor2);
        instructorManager.updateToInstructor(instructor2);
        instructorManager.deleteToInstructor(instructor2);

        instructorManager.addToInstructor(instructor3);
        instructorManager.updateToInstructor(instructor3);
        instructorManager.deleteToInstructor(instructor3);

    }
}