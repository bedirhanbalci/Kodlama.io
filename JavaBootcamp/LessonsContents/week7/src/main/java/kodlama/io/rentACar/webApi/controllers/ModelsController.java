package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.requests.UpdateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.GetByIdModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private final ModelService modelService;

    @GetMapping("/getAll")
    public List<GetAllModelsResponse> getAll() {
        return modelService.getAll();
    }

    @GetMapping("/getById/{id}")
    public GetByIdModelResponse getById(@PathVariable int id) {
        return modelService.getById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateModelRequest updateModelRequest) {
        this.modelService.update(updateModelRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        this.modelService.delete(id);
    }
}
