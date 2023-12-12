package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private final BrandService brandService;

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @GetMapping("/getById/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id) {
        return brandService.getById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateBrandRequest updateBrandRequest) {
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        this.brandService.delete(id);
    }
}