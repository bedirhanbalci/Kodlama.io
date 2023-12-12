package kodlama.io;

public class CategoryManager {

    public void addToCategory(Category category) {
        System.out.println("Kategori eklendi : " + category.getName());
    }

    public void updateToCategory(Category category) {
        System.out.println("Kategori güncellendi : " + category.getName());
    }

    public void deleteToCategory(Category category) {
        System.out.println("Kategori silindi : " + category.getName());
    }
}
