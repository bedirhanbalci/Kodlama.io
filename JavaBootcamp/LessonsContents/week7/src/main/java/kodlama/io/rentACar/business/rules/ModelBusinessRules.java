package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelBusinessRules {

    private final ModelRepository modelRepository;

    public void checkIfModelNameExists(String name) {
        if (this.modelRepository.existsByName(name)) {
            throw new BusinessException("Model adı zaten mevcut!");
        }
    }
}
