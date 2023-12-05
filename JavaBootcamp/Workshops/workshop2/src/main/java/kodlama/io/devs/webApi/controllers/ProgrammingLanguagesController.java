package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguagesController {

    private final ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @PostMapping
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);

    }

    @DeleteMapping()
    public void delete(int id) {
        programmingLanguageService.delete(id);
    }

    @PutMapping()
    public void update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.update(programmingLanguage);
    }

    @GetMapping("{id}")
    public ProgrammingLanguage getById(@PathVariable int id) throws Exception {
        return programmingLanguageService.getById(id);
    }

    @GetMapping("getall")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }
}
