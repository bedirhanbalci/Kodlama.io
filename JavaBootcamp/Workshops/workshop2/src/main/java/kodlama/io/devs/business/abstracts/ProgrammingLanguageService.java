package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage) throws Exception;

    void delete(int id);

    void update(ProgrammingLanguage programmingLanguage);

    ProgrammingLanguage getById(int id);

    List<ProgrammingLanguage> getAll();
}
