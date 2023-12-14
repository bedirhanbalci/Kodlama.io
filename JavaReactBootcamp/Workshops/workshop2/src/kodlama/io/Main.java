package kodlama.io;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(7, "Bedirhan", "Balci", "bedirhanbalci@outlook.com", "123456", "Java-React", "007");

        Instructor instructor = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "123456", "Java-React", "001", "01");


        User[] users = {student, instructor};

        for (User user : users) {
            System.out.println("Id'si " + user.getId() + " olan kullanıcı " + user.getName() + " " + user.getSurname());
        }

        UserManager userManager1 = new StudentManager();
        userManager1.add();

        UserManager userManager2 = new InstructorManager();
        userManager2.add();

    }
}