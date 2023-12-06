package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.TechnologyService;
import kodlama.io.devs.business.dtos.technology.requests.AddTechnologyRequest;
import kodlama.io.devs.business.dtos.technology.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.dtos.technology.responses.GetAllTechnologiesResponse;
import kodlama.io.devs.business.dtos.technology.responses.GetTechnologyResponse;
import kodlama.io.devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {

    private final TechnologyRepository technologyRepository;

    @Override
    public void add(AddTechnologyRequest addTechnologyRequest) {
        Technology technology = new Technology();
        technology.setName(addTechnologyRequest.getName());
        technology.setProgrammingLanguage(addTechnologyRequest.getLanguageid());
        technologyRepository.save(technology);

    }

    @Override
    public void delete(int id) {
        Technology technologyToDelete = technologyRepository.findById(id).orElseThrow();
        technologyRepository.delete(technologyToDelete);
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technologyToUpdate = technologyRepository.findById(updateTechnologyRequest.getId()).orElseThrow();
        technologyToUpdate.setName(updateTechnologyRequest.getName());
        technologyToUpdate.setProgrammingLanguage(updateTechnologyRequest.getLanguageid());
        technologyRepository.save(technologyToUpdate);
    }

    @Override
    public GetTechnologyResponse getById(int id) {
        Technology technologyToId = technologyRepository.findById(id).orElseThrow();
        GetTechnologyResponse getTechnologyResponse = new GetTechnologyResponse();
        getTechnologyResponse.setName(technologyToId.getName());
        getTechnologyResponse.setLanguageid(technologyToId.getProgrammingLanguage());
        return getTechnologyResponse;
    }

    @Override
    public List<GetAllTechnologiesResponse> getAll() {
        List<Technology> technologyList = technologyRepository.findAll();
        List<GetAllTechnologiesResponse> getAllTechnologiesResponseList = new ArrayList<>();
        for (Technology technology : technologyList) {
            GetAllTechnologiesResponse getAllTechnologiesResponse = new GetAllTechnologiesResponse();
            getAllTechnologiesResponse.setId(technology.getId());
            getAllTechnologiesResponse.setName(technology.getName());
            getAllTechnologiesResponse.setLanguageid(technology.getProgrammingLanguage());
            getAllTechnologiesResponseList.add(getAllTechnologiesResponse);
        }
        return getAllTechnologiesResponseList;
    }
}
