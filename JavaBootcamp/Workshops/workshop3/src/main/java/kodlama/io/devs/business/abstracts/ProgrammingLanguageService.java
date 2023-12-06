package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.dtos.programmingLanguage.requests.AddProgrammingLanguageRequest;
import kodlama.io.devs.business.dtos.programmingLanguage.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.dtos.programmingLanguage.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.dtos.programmingLanguage.responses.GetProgrammingLanguageResponse;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(AddProgrammingLanguageRequest addProgrammingLanguageRequest) throws Exception;

    void delete(int id);

    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception;

    GetProgrammingLanguageResponse getById(int id);

    List<GetAllProgrammingLanguagesResponse> getAll();
}
