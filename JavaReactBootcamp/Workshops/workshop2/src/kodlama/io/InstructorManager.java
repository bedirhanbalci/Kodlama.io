package kodlama.io;

public class InstructorManager extends UserManager {

    @Override
    public void add() {
        System.out.println("Eğitmen eklendi!");
    }

    @Override
    public void update() {
        System.out.println("Eğitmen güncellendi!");
    }

    @Override
    public void delete() {
        System.out.println("Eğitmen silindi!");
    }

}
