package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.business.dtos.ProductWithCategoryDto;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Category;
import kodlamaio.northwind.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
@CrossOrigin
public class ProductsController {

    private final ProductService productService;

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @GetMapping("/getAllDesc")
    public DataResult<List<Product>> getAllSorted(){
        return this.productService.getAllSorted();
    }

    @GetMapping("/getAllByPage/{pageNo}/{pageSize}")
    public DataResult<List<Product>> getAllByPage(@PathVariable int pageNo, @PathVariable int pageSize){
        return this.productService.getAllByPage(pageNo, pageSize);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName){
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategoryCategoryId")
    public DataResult<Product> getByProductNameAndCategoryCategoryId(@RequestParam String productName, @RequestParam int categoryId){
        return this.productService.getByProductNameAndCategoryCategoryId(productName, categoryId);
    }

    @GetMapping("/getByProductNameOrCategoryCategoryId")
    public DataResult<List<Product>> getByProductNameOrCategoryCategoryId(@RequestParam String productName, @RequestParam int categoryId){
        return this.productService.getByProductNameOrCategoryCategoryId(productName, categoryId);
    }

    @GetMapping("/getByCategoryIn")
    public DataResult<List<Product>> getByCategoryIn(@RequestParam List<Category> categories){
        return this.productService.getByCategoryIn(categories);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getByProductNameStartsWith")
    public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName){
        return this.productService.getByProductNameStartsWith(productName);
    }

    @GetMapping("/getByNameAndCategory")
    public DataResult<List<Product>> getByProductNameAndCategory(@RequestParam String productName, @RequestParam int categoryId){
        return this.productService.getByProductNameAndCategory(productName, categoryId);
    }

    @GetMapping("/getProductByWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductByWithCategoryDetails(){
        return this.productService.getProductByWithCategoryDetails();
    }

}
