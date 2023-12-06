package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.TechnologyService;
import kodlama.io.devs.business.dtos.technology.requests.AddTechnologyRequest;
import kodlama.io.devs.business.dtos.technology.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.dtos.technology.responses.GetAllTechnologiesResponse;
import kodlama.io.devs.business.dtos.technology.responses.GetTechnologyResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technology")
@AllArgsConstructor
public class TechnologiesController {

    private final TechnologyService technologyService;

    @PostMapping("/add")
    public void add(@RequestBody AddTechnologyRequest addTechnologyRequest) {
        technologyService.add(addTechnologyRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        technologyService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateTechnologyRequest updateTechnologyRequest) {
        technologyService.update(updateTechnologyRequest);
    }

    @GetMapping("{id}")
    public GetTechnologyResponse getById(@PathVariable int id) {
        return technologyService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllTechnologiesResponse> getAll() {
        return technologyService.getAll();
    }


}
