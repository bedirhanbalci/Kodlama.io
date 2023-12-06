package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.dtos.technology.requests.AddTechnologyRequest;
import kodlama.io.devs.business.dtos.technology.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.dtos.technology.responses.GetAllTechnologiesResponse;
import kodlama.io.devs.business.dtos.technology.responses.GetTechnologyResponse;

import java.util.List;

public interface TechnologyService {

    void add(AddTechnologyRequest addTechnologyRequest);

    void delete(int id);

    void update(UpdateTechnologyRequest updateTechnologyRequest);

    GetTechnologyResponse getById(int id);

    List<GetAllTechnologiesResponse> getAll();
}
