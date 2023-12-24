package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.business.dtos.ProductWithCategoryDto;
import kodlamaio.northwind.entities.concretes.Category;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findByProductName(String productName);

    Product findByProductNameAndCategoryCategoryId(String productName, int categoryId);

    List<Product> findByProductNameOrCategoryCategoryId(String productName, int categoryId);

    List<Product> findByCategoryIn(List<Category> categories);

    List<Product> findByProductNameContains(String productName);

    List<Product> findByProductNameStartsWith(String productName);

    @Query("FROM Product WHERE productName = :productName AND category.categoryId = :categoryId")
    List<Product> findByProductNameAndCategory(String productName, int categoryId);


    @Query("SELECT NEW kodlamaio.northwind.business.dtos.ProductWithCategoryDto" +
            "(p.productId, p.productName, c.categoryName) FROM Category c INNER JOIN c.products p ")
    List<ProductWithCategoryDto> findProductByWithCategoryDetails();
}