package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.dtos.programmingLanguage.requests.AddProgrammingLanguageRequest;
import kodlama.io.devs.business.dtos.programmingLanguage.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.dtos.programmingLanguage.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.dtos.programmingLanguage.responses.GetProgrammingLanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository programmingLanguageRepository;

    @Override
    public void add(AddProgrammingLanguageRequest addProgrammingLanguageRequest) throws Exception {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.setName(addProgrammingLanguageRequest.getName());

        if (language.getName().isEmpty()) {
            throw new Exception("Programlama dili boş olamaz");
        }
        for (GetAllProgrammingLanguagesResponse languagesResponse : getAll()) {
            if (languagesResponse.getName().equals(language.getName())) {
                throw new Exception("Bu programlama dili zaten var");
            }
        }
        programmingLanguageRepository.save(language);
    }

    @Override
    public void delete(int id) {
        ProgrammingLanguage programmingLanguageToDelete = programmingLanguageRepository.findById(id).orElseThrow();
        programmingLanguageRepository.delete(programmingLanguageToDelete);
    }

    @Override
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {
        Optional<ProgrammingLanguage> optionalLanguage = programmingLanguageRepository.findById(updateProgrammingLanguageRequest.getId());

        if (optionalLanguage.isPresent()) {
            ProgrammingLanguage language = optionalLanguage.get();
            language.setName(updateProgrammingLanguageRequest.getName());
            programmingLanguageRepository.save(language);
        } else {
            throw new Exception("Programlama dili güncellenemedi");
        }
    }

    @Override
    public GetProgrammingLanguageResponse getById(int id) {
        ProgrammingLanguage programmingLanguageToId = programmingLanguageRepository.findById(id).orElseThrow();
        GetProgrammingLanguageResponse getProgrammingLanguageResponse = new GetProgrammingLanguageResponse();
        getProgrammingLanguageResponse.setName(programmingLanguageToId.getName());
        return getProgrammingLanguageResponse;
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> languagesResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();

        for (ProgrammingLanguage programmingLanguage : languages) {
            GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
            responseItem.setId(programmingLanguage.getId());
            responseItem.setName(programmingLanguage.getName());

            languagesResponse.add(responseItem);
        }
        return languagesResponse;
    }
}
