package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.business.dtos.ProductWithCategoryDto;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Category;
import kodlamaio.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    DataResult<List<Product>> getAll();

    DataResult<List<Product>> getAllSorted();

    DataResult<List<Product>> getAllByPage(int pageNo, int pageSize);

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategoryCategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategoryCategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIn(List<Category> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByProductNameAndCategory(String productName, int categoryId);

    DataResult<List<ProductWithCategoryDto>> getProductByWithCategoryDetails();

}
