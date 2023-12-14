package kodlama.io;

public class StudentManager extends UserManager {

    @Override
    public void add() {
        System.out.println("Öğrenci eklendi!");
    }

    @Override
    public void update() {
        System.out.println("Öğrenci güncellendi!");
    }

    @Override
    public void delete() {
        System.out.println("Öğrenci silindi!");
    }

}
