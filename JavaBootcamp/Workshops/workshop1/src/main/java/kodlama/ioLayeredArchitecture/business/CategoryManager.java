package kodlama.ioLayeredArchitecture.business;

import kodlama.ioLayeredArchitecture.core.logging.Logger;
import kodlama.ioLayeredArchitecture.dataAccess.CategoryDao;
import kodlama.ioLayeredArchitecture.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private final CategoryDao categoryDao;
    private Logger[] loggers;
    private List<String> categoryName = new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if (categoryName.contains(category.getName())) {
            throw new Exception("Kategori ismi tekrar edemez");
        } else {
            categoryName.add(category.getName());
            categoryDao.add(category);
            for (Logger logger : loggers) {
                logger.log(category.getName());
            }
        }
    }
}
