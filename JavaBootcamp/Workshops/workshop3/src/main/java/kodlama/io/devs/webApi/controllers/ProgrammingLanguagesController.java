package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.dtos.programmingLanguage.requests.AddProgrammingLanguageRequest;
import kodlama.io.devs.business.dtos.programmingLanguage.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.dtos.programmingLanguage.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.dtos.programmingLanguage.responses.GetProgrammingLanguageResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
@AllArgsConstructor
public class ProgrammingLanguagesController {

    private final ProgrammingLanguageService programmingLanguageService;

    @PostMapping("/add")
    public void add(@RequestBody AddProgrammingLanguageRequest addProgrammingLanguageRequest) throws Exception {
        programmingLanguageService.add(addProgrammingLanguageRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        programmingLanguageService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {
        programmingLanguageService.update(updateProgrammingLanguageRequest);
    }

    @GetMapping("{id}")
    public GetProgrammingLanguageResponse getById(@PathVariable int id) {
        return programmingLanguageService.getById(id);
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        return programmingLanguageService.getAll();
    }
}
